import java.util.*;

public class ass2 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Inserting 
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Linked List: " + list);

        // Insert element at beginning
        list.addFirst(5);

        System.out.println("After inserting: " + list);

        // Insert element at end
        list.addLast(50);

        System.out.println("After adding last: " + list);

        // Delete first element
        list.removeFirst();

        System.out.println("After deleting first: " + list);

        // Delete last element
        list.removeLast();

        System.out.println("After deleting last: " + list);

        // Display first element
        System.out.println("First element: " + list.getFirst());

        // Display last element
        System.out.println("Last element: " + list.getLast());

        // Display size
        System.out.println("Size: " + list.size());
    }
}
