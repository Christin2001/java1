import java.util.Scanner;
class NegException extends Exception{
   public NegException(String s){
   super(s);
  }
}
public class average {
  public static void main(String[] args){
     System.out.println("\nName:Christin Benny\nReg No:22MCA021\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:23/06/2023\n\n");
  
      int i;
      double sum=0,avg=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n numbers:");
      int n=sc.nextInt();
      for(i=1;i<=n;i++){
         try{
           System.out.println("Enter number"+i);
           int a=sc.nextInt();
           if(a<0){
              i--;
              throw new NegException("Negative numbers not allowed,Try again");
           }
           else{
             sum=sum+a;
           }
          }
        catch(NegException e){
        System.out.println("NEGETIVE EXCEPTION OCCURED:"+e);
      }
    }
    avg=sum/n;
    System.out.println("Average is "+avg);
    sc.close();
  }
}
