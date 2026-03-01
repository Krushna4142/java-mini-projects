import java.util.Scanner;

public class StudentApp {

  public static void main(String[] args) {

    StudentManager manager = new StudentManager();
    Scanner sc = new Scanner(System.in);

    while (true) {

      System.out.println("\n===== 🎓 Student Record System =====");
      System.out.println("1. Add Student");
      System.out.println("2. View Students");
      System.out.println("3. Search Student");
      System.out.println("4. Update Marks");
      System.out.println("5. Delete Student");
      System.out.println("6. Exit");
      System.out.print("Enter choice: ");

      int choice = sc.nextInt();

      switch (choice) {

        case 1:
          System.out.print("Enter Roll Number: ");
          int roll = sc.nextInt();
          sc.nextLine();

          System.out.print("Enter Name: ");
          String name = sc.nextLine();

          System.out.print("Enter Marks: ");
          double marks = sc.nextDouble();

          Student student = new Student(roll, name, marks);
          manager.addStudent(student);
          break;

        case 2:
          manager.viewStudents();
          break;

        case 3:
          System.out.print("Enter Roll Number to search: ");
          int searchRoll = sc.nextInt();

          Student found = manager.findStudent(searchRoll);
          if (found != null) {
            found.display();
          } else {
            System.out.println("❌ Student not found.");
          }
          break;

        case 4:
          System.out.print("Enter Roll Number to update: ");
          int updateRoll = sc.nextInt();

          System.out.print("Enter New Marks: ");
          double newMarks = sc.nextDouble();

          manager.updateStudentMarks(updateRoll, newMarks);
          break;

        case 5:
          System.out.print("Enter Roll Number to delete: ");
          int deleteRoll = sc.nextInt();
          manager.deleteStudent(deleteRoll);
          break;

        case 6:
          System.out.println("👋 Exiting... Thank You!");
          sc.close();
          return;

        default:
          System.out.println("❌ Invalid choice.");
      }
    }
  }
}