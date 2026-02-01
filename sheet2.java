import java.util.*;

class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this);
    }

    public void showEnrolledCourses() {
        System.out.println("\nCourses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showSchoolDetails() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Students in School:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

public class sheet2 {
    public static void main(String[] args) {
        School school = new School("Green Valley High School");

        Student s1 = new Student("Ishita");
        Student s2 = new Student("Rahul");

        school.addStudent(s1);
        school.addStudent(s2);

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");
        Course c3 = new Course("English");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);
        s2.enrollCourse(c3);

        school.showSchoolDetails();
        s1.showEnrolledCourses();
        s2.showEnrolledCourses();
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
        c3.showEnrolledStudents();
    }
}
