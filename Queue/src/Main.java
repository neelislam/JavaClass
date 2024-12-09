import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        //fifo - first in first out
        // add == enqueue, offer()
        // remove == dequeue, poll()
        //queue allows multiple values
        Queue<String> queue = new LinkedList<String>(); //declare queue
        System.out.println("Is queue Empty: " + queue.isEmpty()); //true of false
        queue.offer("Goru"); //push ==  offer
        queue.offer("Mohish");
        queue.offer("Haati");
        queue.offer("Sagol");
        queue.offer("Sagol");
        queue.offer("Khatash");
        queue.offer("PabdaMach");
        System.out.println("Size of queue is "+queue.size()); //size of queue
        System.out.println("Elements: " +queue); //element
        System.out.println("First element: " + queue.peek()); //top element of queue (1st element)
        System.out.println("Is Sagol there? ");
        System.out.println(queue.contains("Sagol"));//if exists, will show true
        System.out.println("Is MolaMach there? ");
        System.out.println(queue.contains("MolaMach"));  // nai tai false
        queue.poll(); //dequeue == poll (delete)
        System.out.println(queue);


        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();

        System.out.println(queue);

    }
}