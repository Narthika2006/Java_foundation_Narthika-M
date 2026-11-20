
import java.util.*;

public class ass5 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String[] seats = new String[3];
Queue<String> waitlist = new LinkedList<>();

System.out.println("Enter number of learners:");
int n = sc.nextInt();
sc.nextLine();

for (int i = 0; i < n; i++) {
System.out.print("Enter learner name: ");
String name = sc.nextLine();

boolean found = false;

for (int j = 0; j < 3; j++) {
if (seats[j] == null) {
seats[j] = name;
found = true;
break;
}
}

if (!found) {
waitlist.add(name);
}

System.out.println("Seats: " + Arrays.toString(seats));
System.out.println("Waiting: " + waitlist);
}

System.out.print("Enter learner who drops out: ");
String drop = sc.nextLine();

boolean found = false;

for (int i = 0; i < 3; i++) {
if (drop.equals(seats[i])) {
found = true;

if (!waitlist.isEmpty()) {
seats[i] = waitlist.poll();
} else {
seats[i] = null;
}
break;
}
}

if (found) {
System.out.println("Seats: " + Arrays.toString(seats));
System.out.println("Waiting: " + waitlist);
} else {
System.out.println("Name not found in batch");
}

sc.close();
}
}