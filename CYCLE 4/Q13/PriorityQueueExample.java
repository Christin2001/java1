import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(5);
        queue.offer(2);
        queue.offer(8);
        queue.offer(1);

        System.out.println("\nName:Christin Benny\nReg No:22MCA021\nCourse Code and Name: 20MCA132, Object Oriented Programming Lab\nDate:27/06/2023\n\n");
        System.out.println("Queue elements: " + queue);

      
        while (!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println("Removed element: " + element);
        }
    }
}

