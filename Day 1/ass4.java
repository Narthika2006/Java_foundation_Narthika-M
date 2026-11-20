import java.util.*;

public class ass4 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
Stack<String> names = new Stack<>();

while (true) {

System.out.println("\n1. Enroll learner");
System.out.println("2. Undo last enrollment");
System.out.println("3. Show last enrollment");
System.out.println("4. Exit");

System.out.print("Enter your choice: ");
int choice = sc.nextInt();
sc.nextLine();

switch (choice) {

case 1:
    System.out.print("Enter learner name: ");
    String name = sc.nextLine();
    names.push(name);
    System.out.println("Enrolled: " + name);
    break;

case 2:
    if (names.isEmpty()) {
        System.out.println("Nothing to undo");
    } else {
        System.out.println("Undone: " + names.pop());
    }
    break;

case 3:
    if (names.isEmpty()) {
        System.out.println("Nothing to undo");
    } else {
        System.out.println("Last enrollment: " + names.peek());
    }
    break;

case 4:
    System.out.println("Exit");
    sc.close();
    return;

default:
    System.out.println("Invalid choice");
}
}
}
}