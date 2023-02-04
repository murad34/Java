package Map_lesson;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class MyEnumMap {

    public static void main(String[] args) {

        Map<Animal,String> enumMap = new EnumMap<Animal, String>(Animal.class);
        enumMap.put(Animal.cat,"pishiy");
        enumMap.put(Animal.dog,"it");
        enumMap.put(Animal.bird,"qush");

        Set set = enumMap.entrySet();

        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }

    enum Animal {
        cat,dog,bird
    }

}
