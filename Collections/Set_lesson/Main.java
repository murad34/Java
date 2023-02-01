package Set_lesson;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Murad");
        list.add("Murad");
        list.add("Murad");
        list.add("Ruslan");
        list.add("Ruslan");
        list.add("Ruslan");
        list.add("Ruslan");
        list.add("Abu Talib");
        list.add("Abu Talib");
        list.add("Abu Talib");
        list.add("Abu Talib");
        list.add("Abu Talib");

        Set<String> set = new HashSet<>(list);

        for (String s : set) {
            System.out.println(s);
        }

    }

}
