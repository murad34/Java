package Map_lesson;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Murad");
        map.put(2,"Ruslan");
        map.put(3,"AbuTalib");
        System.out.println(map.size());
        System.out.println(map);

        // key - unikal, yeni obyekt elave olunmur, hemin keyde ki element deyishir

        map.put(2,"Safar");
        System.out.println(map.size());
        System.out.println(map);

    }

}
