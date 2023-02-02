package Map_lesson;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Teacher,Student> students = new HashMap<>();

        Teacher teacher1 = new Teacher(1,"Aleksandra","Yurevna");
        Teacher teacher2 = new Teacher(1,"Rita","Azizovna");

        students.put(teacher1,new Student(1,"Murad","Mehdiyev"));
        students.put(teacher1,new Student(2,"Imran","Shixlinskiy"));
        students.put(teacher2,new Student(3,"Lala","Aliyeva"));
        students.put(teacher2,new Student(4,"Kama","Xabibulina"));

        System.out.println("---------------------------------------------------------------------------------");

        students.get(teacher1);


    }

}
