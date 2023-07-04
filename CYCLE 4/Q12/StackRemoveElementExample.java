import java.util.Stack;

public class StackRemoveElementExample {
    public static void main(String[] args) {
    	System.out.println("\nName:Christin Benny\nReg No:22MCA021\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:27/06/2023\n\n");
        
        Stack<String> stack = new Stack<>();

       
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        stack.push("Mango");

       


        System.out.println("Stack elements: " + stack);

        int positionToRemove = 2; 
        removeElement(stack, positionToRemove);

        

        System.out.println("Stack after removal: " + stack);
    }

    public static void removeElement(Stack<String> stack, int position) {
        if (stack.isEmpty() || position <= 0 || position > stack.size()) {
            System.out.println("Invalid position or stack is empty.");
            return;
        }

      
        Stack<String> tempStack = new Stack<>();

        
        for (int i = 1; i < position; i++) {
            tempStack.push(stack.pop());
        }

        
        stack.pop();

     
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}

