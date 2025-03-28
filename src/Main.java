import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Андрей", 25);
        map.put("Олеся", 30);
        map.put("Алина", 36);
        map.put("Оля", 27);

        List<Map.Entry<String, Integer>> list1 = new ArrayList<>(map.entrySet());
        List<Map.Entry<String, Integer>> list2 = new ArrayList<>(map.entrySet());

        Collections.sort(list1, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println(list1);

        System.out.println();

        Collections.sort(list2, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        System.out.println(list2);
    }
}
