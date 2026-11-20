import java.util.*;

public class ass3 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int[] attendance = new int[10];
int[] total = new int[11];

System.out.println("Enter attendance for 10 days:");
for (int i = 0; i < 10; i++) {
    attendance[i] = sc.nextInt();
}

total[0] = 0;

for (int i = 1; i <= 10; i++) {
    total[i] = total[i - 1] + attendance[i - 1];
}

System.out.println("Enter starting day and ending day:");
int start = sc.nextInt();
int end = sc.nextInt();

if (start < 1 || end > 10 || start > end) {
    System.out.println("Invalid range");
} else {
    int sum = total[end] - total[start - 1];
    System.out.println("Total attendance: " + sum);
}

int max = attendance[0];
int day = 1;

for (int i = 1; i < 10; i++) {
    if (attendance[i] > max) {
        max = attendance[i];
        day = i + 1;
    }
}

System.out.println("Highest attendance: " + max);
System.out.println("Day: " + day);

sc.close();
}
}