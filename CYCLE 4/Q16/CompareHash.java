import java.util.*;
public class CompareHash {
public static void main(String[] args) {
System.out.println("\nName : Christin Benny\nReg No: 22MCA021\nCourse Code and Name : 20MCA132,Object Oriented Programming Lab\nDate : 27/06/2023\n\n");
HashSet<String> h_set = new HashSet<String>();
h_set.add("Red");
h_set.add("Green");
h_set.add("Black");
h_set.add("White");
HashSet<String>h_set2 = new HashSet<String>();
h_set2.add("Red");
h_set2.add("Pink");
h_set2.add("Black");
h_set2.add("Orange");
HashSet<String>result_set = new HashSet<String>();
for (String element : h_set){

System.out.println(h_set2.contains(element) ? "Yes" : "No");
}
}
}
