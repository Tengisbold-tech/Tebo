package Lab7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studentmanager manager = new Studentmanager();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1.Oyutan nemeh");
            System.out.println("2. Oyutan ustgah");
            System.out.println("3. Oyutan haih");
            System.out.println("4. Erembeleh");
            System.out.println("5. BUh oyutnii medeelel harah");
            System.out.println("6. Garah");
            System.out.print("Songolt: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Ner: ");
                    String name = sc.nextLine();

                    System.out.print("Nas: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    Student s = new Student(name, age, id);
                    manager.addStudent(s);
                    break;

      case 2:
           System.out.print("Ustgah ID: ");
         String removeId = sc.nextLine();
            manager.removeStudent(removeId);
           break;

                case 3:
                   System.out.print("Haih ID: ");
                   String searchId = sc.nextLine();
                    Student found = manager.findStudent(searchId);

                    if (found != null) {
                        System.out.println("Ur dun: " + found);
                    } else {
                        System.out.println("Oldsongui.");
                    }
                    break;

                case 4:
                    manager.sortByName();
                    break;

                case 5:
                    manager.printAllStudents();
                    break;

                case 6:
                    System.out.println("program duuslaa.");
                    return;

                default:
                    System.out.println("Songolt buruu bn!");
            }
        }
    }
}