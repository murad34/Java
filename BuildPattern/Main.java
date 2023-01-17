package BuildPattern;

public class Main {

    public static void main(String[] args) {

        Fanar.FanarBuilder builder = Fanar.builder();

        builder.whayIsYourName("Murad");
        builder.whayIsYourSurname("Mehdiyev");
        builder.whayIsYourAge(19);

        Fanar f = builder.build();

        System.out.println(f.getName()+" "+f.getSurame()+" "+f.getAge());

    }

}
