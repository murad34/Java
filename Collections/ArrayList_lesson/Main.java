package ArrayList_lesson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Murad");
        list.add("Lyaman");
        list.add("Revan");
        list.add("Tural");

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        for (String s : list) {
            System.out.println(s);
        }
        // == Iterator<String> iterator = list.iterator;
        //    while (iterator.hasNext()) {
        //             String s = iterator.next();
        //         }


    }

}