import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Task> tasks = new ArrayList<>();

    int choice;

    do {
      System.out.println("\n====== TO-DO LIST MENU ======");
      System.out.println("1. Add Task");
      System.out.println("2. View Tasks");
      System.out.println("3. Mark Task as Completed");
      System.out.println("4. Delete Task");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");

      choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {

        case 1:
          System.out.print("Enter task name: ");
          String name = sc.nextLine();
          tasks.add(new Task(name));
          System.out.println("✅ Task added successfully!");
          break;

        case 2:
          if (tasks.isEmpty()) {
            System.out.println("⚠ No tasks available.");
          } else {
            System.out.println("\n📋 Your Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
              Task t = tasks.get(i);
              String status = t.isCompleted() ? "✔ Completed" : "❌ Pending";
              System.out.println((i + 1) + ". " + t.getTaskName() + " [" + status + "]");
            }
          }
          break;

        case 3:
          System.out.print("Enter task number to mark completed: ");
          int completeIndex = sc.nextInt() - 1;

          if (completeIndex >= 0 && completeIndex < tasks.size()) {
            tasks.get(completeIndex).markCompleted();
            System.out.println("✅ Task marked as completed!");
          } else {
            System.out.println("❌ Invalid task number.");
          }
          break;

        case 4:
          System.out.print("Enter task number to delete: ");
          int deleteIndex = sc.nextInt() - 1;

          if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
            tasks.remove(deleteIndex);
            System.out.println("🗑 Task deleted successfully!");
          } else {
            System.out.println("❌ Invalid task number.");
          }
          break;

        case 5:
          System.out.println("🚀 Exiting To-Do List App. Stay productive!");
          break;

        default:
          System.out.println("❌ Invalid choice. Try again.");
      }

    } while (choice != 5);

    sc.close();
  }
}