package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//----------------------------------------------------------------------------------------------------------------------

        // compareTo (Comparable)
        Person p1 = new Person(18);
        Person p2 = new Person(19);
        System.out.println(p1.compareTo(p2));

//----------------------------------------------------------------------------------------------------------------------

        // compare (Comparator)
        CompareByAge comparator = new CompareByAge();
        Person p3 = new Person(19);
        Person p4 = new Person(19);

        System.out.println(comparator.compare(p3,p4));

//----------------------------------------------------------------------------------------------------------------------

        // Person implements Comparable<Person>
//        List list = new ArrayList();
//        list.add(new Person(19));
//        list.add(new Person(20));
//        list.add(new Person(18));
//        list.add(new Person(17));
//        list.add(new Person(19));
//
//        Collections.sort(list);
//
//        for (Object o : list) {
//            System.out.println(o);
//        }

//----------------------------------------------------------------------------------------------------------------------

        // Student implements Comparator<Student>
//        List list = new ArrayList();
//        list.add(new Student(19));
//        list.add(new Student(22));
//        list.add(new Student(20));
//        list.add(new Student(21));
//        list.add(new Student(19));
//
//        Comparator<Student> comparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                if (s1.getAge() > s2.getAge()) {
//                    return 1;
//                } else if (s1.getAge() < s2.getAge()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        };
//
//        Collections.sort(list,comparator);
//
//        for (Object o : list) {
//            System.out.println(o);
//        }

//----------------------------------------------------------------------------------------------------------------------

        // Collections.sort
//        List<Car> list = new ArrayList<Car>();
//        list.add(new Car("bmw", 2010));
//        list.add(new Car("mercedes", 2015));
//        list.add(new Car("nissan", 2013));
//        list.add(new Car("hyundai", 2007));
//        list.add(new Car("kia", 2005));
//        list.add(new Car("porche", 2002));
//
//        Collections.sort(list, new SortByComparator());
//
//        for (Car c : list) {
//            System.out.println(c);
//        }

//----------------------------------------------------------------------------------------------------------------------

    }

}
