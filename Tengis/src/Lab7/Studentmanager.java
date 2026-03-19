package Lab7;
import java.util.*;
public class Studentmanager {
    private List<Student> students;

    public Studentmanager() {
        students = new ArrayList<>();
    }
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Oyutan amjilttai nemegdlee.");
    }

    public void removeStudent(String studentId) {
        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student s = it.next();
            if (s.getStudentId().equals(studentId)) {
                it.remove();
                System.out.println("Oyutan ustgagdlaa.");
                return;
            }
        }
        System.out.println("Oyutan oldsongui.");
    }

    
    public Student findStudent(String studentId) {
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

   
    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("List hooson bn.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void sortByName() {
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Nereer ermbellee.");
    }
}