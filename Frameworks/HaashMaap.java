import java.util.HashMap;

public class HaashMaap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);  
        System.out.println(map.get("one"));
        System.out.println(map.get("four"));
        map.remove("two");
        System.out.println(map);  
        System.out.println();
        for (String str : map.keySet()) { 
            System.out.println(str + " -> " + map.get(str));
            
        }
    }
}