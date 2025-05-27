import java.util.HashMap;

public class KeysGreaterThanTwo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);
        map.put(5, 50);
        System.out.println("Keys greater than 2:");
        // for(int key : map.keySet()) {
        //     if (key > 2) {
        //         System.out.println(key + " -> " + map.get(key));
        //     }
        // }
        map.forEach((key, value) -> {
            if (key > 2) {
                System.out.println(key + " -> " + value);
            }
        });
    }
}
