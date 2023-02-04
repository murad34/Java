package List_Lesson;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // simple arrayList
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(0,50);
//
//        System.out.println(list);
//        System.out.println("size = " + list.size());
//
//        for (int i : list) {
//            System.out.println(i);
//        }

        List<Person> personList = new ArrayList<>();

        Person p1 = new Person("Murad");
        Person p2 = new Person("Lyaman");

        personList.add(p1);
        personList.add(p2);

        for (Person personFromCollection : personList) {
            System.out.println(personFromCollection);
        }



    }

}
