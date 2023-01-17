package BuildPattern;

public class Fanar {

    private String name = null;
    private String surname = null;
    private int age;

    private Fanar() {
    }

    public Fanar(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurame() {
        return surname;
    }
    public int getAge() {
        return age;
    }


    public static FanarBuilder builder() {
        return new FanarBuilder();
    }

    public static class FanarBuilder {

        private Fanar f = null;

        public FanarBuilder() {
            f = new Fanar();
        }

        public Fanar build() {
            return new Fanar(f.name, f.surname, f.age);
        }

        public FanarBuilder whayIsYourName(String name) {
            this.f.name = name;
            return this;
        }

        public FanarBuilder whayIsYourSurname(String surname) {
            this.f.surname = surname;
            return this;
        }

        public FanarBuilder whayIsYourAge(int age) {
            this.f.age = age;
            return this;
        }


    }

}
