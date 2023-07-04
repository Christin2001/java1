import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapToTreeMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);

        // Convert HashMap to TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Print the HashMap
System.out.println("\nName : Christin Benny\nReg No: 22MCA021\nCourse Code and Name : 20MCA132,Object Oriented Programming Lab\nDate : 27/06/2023\n\n");
        System.out.println("HashMap: " + hashMap);

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);
    }
}

