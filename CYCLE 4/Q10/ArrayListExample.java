import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
    System.out.println("\nName:Christin Benny\nReg No:22MCA021\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:27/06/2023\n\n");
        List<String> stringList = new ArrayList<>();
        
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Mango");

        System.out.println("Original List: " + stringList);

        String firstElement = stringList.get(0);
        System.out.println("First Element: " + firstElement);

        stringList.set(1, "Grapes");
        System.out.println("Modified List: " + stringList);

        boolean containsMango = stringList.contains("Mango");
        System.out.println("Contains Mango? " + containsMango);

        stringList.remove("Orange");
        System.out.println("List after removing Orange: " + stringList);

        Collections.sort(stringList);
        System.out.println("Sorted List: " + stringList);

        Collections.reverse(stringList);
        System.out.println("Reversed List: " + stringList);

        int size = stringList.size();
        System.out.println("Size of the list: " + size);

        stringList.clear();
        System.out.println("List after clearing: " + stringList);
    }
}

