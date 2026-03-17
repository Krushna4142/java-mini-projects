import java.util.Scanner;

public class PayrollManager {

  Employee[] employees = new Employee[50];
  int count = 0;

  Scanner sc = new Scanner(System.in);

  public void addEmployee() {

    System.out.print("Enter Employee ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Employee Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Basic Salary: ");
    double salary = sc.nextDouble();

    employees[count] = new Employee(id, name, salary);
    count++;

    System.out.println("Employee Added Successfully!");
  }

  public void viewPayroll() {

    if (count == 0) {
      System.out.println("No employee records found.");
      return;
    }

    for (int i = 0; i < count; i++) {
      employees[i].calculateSalary();
    }
  }
}