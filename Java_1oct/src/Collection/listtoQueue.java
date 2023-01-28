package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class listtoQueue {

	public static void main(String[] args) {
		Queue Q= new LinkedList<Integer>();

    // Add numbers to end of Queue
    Q.add(7855642);
    Q.add(35658786);
    Q.add("A");
    Q.add(74381793);

    // before removing print queue
    System.out.println("Queue: " + Q);

	}

}
