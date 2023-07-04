import java.util.Scanner;

public class Overload {
  void calculateArea(float x) {
    System.out.println("Area of the square: "+x*x+ "sq units");
  }
  
  void calculateArea(float x, float y) {
    System.out.println("\nArea of rectangle: " +x*y+ "sq units");
  }
  
  void calculateArea(double r) {
    double area = 3.14*r*r;
    System.out.println("\nArea of the circle: " +area+ "sq units");
  }
  
  public static void main(String args[]) {
  
    System.out.println("\nName:Christin Benny\nReg No:22MCA021\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:02/06/2023\n\n");

    Overload obj = new Overload();
    
    System.out.println("Enter the side of the square: ");
    Scanner sc = new Scanner(System.in);
    float side = sc.nextFloat();
    obj.calculateArea(side);
    
    System.out.println("\nEnter sides of the rectangle: ");
    float side1 = sc.nextFloat();
    float side2 = sc.nextFloat();
    obj.calculateArea(side1, side2);
    
    
    System.out.println("\nEnter the radius of the circle: ");
    double rad = sc.nextDouble();
    obj.calculateArea(rad);
  }
  
}
