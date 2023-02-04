package Set_lesson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); // unique
        set.add("Murad");
        set.add("Murad");
        set.add("Murad");
        set.add("Revan");
        set.add("Revan");

        for (String s : set) {
            System.out.println(s);
        }

        // ---------------------------------------------------------

        List<String> list = new ArrayList<>();
        list.add("Turalll");
        list.add("Turalll");
        list.add("Turalll");
        list.add("Murad");
        list.add("Murad");
        list.add("Murad");
        list.add("Abuuu");
        list.add("Abuuu");
        list.add("Abuuu");

        Set<String> set2 = new HashSet<>(list);

        for (String s : set2) {
            System.out.println(s);
        }

    }

}
