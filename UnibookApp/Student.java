package UnibookApp;

public class Student {

    private String name;

    private String surname;

    private int age;

    private int classNumber;

    public Student() {
    }

    public Student(String name, String surname, int age, int classNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getFullInfo() {

        return ( this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getClassNumber() ) ;

    }

}
