package Basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1.size()); // list.size() razmer lista

        // convert to array
        Object[] arr = list1.toArray();
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }

        //-------------------------------------------------------------

        Collection<Integer> list2 = new ArrayList<>();

        list2.addAll(list1); // addAll hamsini birden elave eliyir
        System.out.println(list2);

        list2.clear();// icinde hamsini silir
        System.out.println(list2);

        System.out.println(list2.isEmpty());// boshdu ?

        //---------------------------------------------------------------

        // how works iterator
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(5);
        list3.add(7);

        Iterator<Integer> iterator = list3.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }


    }

}