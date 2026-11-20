
import java.util.*;

class Course {
    int id;
    String name;
    double fee;

    // Constructor
    Course(int id, String name, double fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    // Display course details
    public String toString() {
        return id + "  " + name + "  " + fee;
    }
}

public class ass1 {
    public static void main(String[] args) {

        // Creating a list of courses
        List<Course> courses = new ArrayList<>();

        courses.add(new Course(101, "Java", 15000));
        courses.add(new Course(102, "Python", 12000));
        courses.add(new Course(103, "React", 15000));
        courses.add(new Course(104, "SQL", 8000));
        courses.add(new Course(105, "Angular", 12000));

        // 1. Sort by fee - Low to High
        Collections.sort(courses, new Comparator<Course>() {
            public int compare(Course c1, Course c2) {
                return Double.compare(c1.fee, c2.fee);
            }
        });

        System.out.println("Fee: Low to High");
        for (Course c : courses) {
            System.out.println(c);
        }

        // 2. Sort by fee - High to Low
        Collections.sort(courses, new Comparator<Course>() {
            public int compare(Course c1, Course c2) {
                return Double.compare(c2.fee, c1.fee);
            }
        });

        System.out.println("\nFee: High to Low");
        for (Course c : courses) {
            System.out.println(c);
        }

        // 3. Sort by name - A to Z
        Collections.sort(courses, new Comparator<Course>() {
            public int compare(Course c1, Course c2) {
                return c1.name.compareTo(c2.name);
            }
        });

        System.out.println("\nName: A to Z");
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}