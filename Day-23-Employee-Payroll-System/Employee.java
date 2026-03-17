public class Employee {

  int id;
  String name;
  double basicSalary;

  public Employee(int id, String name, double basicSalary) {
    this.id = id;
    this.name = name;
    this.basicSalary = basicSalary;
  }

  public void calculateSalary() {

    double hra = basicSalary * 0.20;
    double da = basicSalary * 0.10;
    double deductions = basicSalary * 0.05;

    double netSalary = basicSalary + hra + da - deductions;

    System.out.println("Employee ID: " + id);
    System.out.println("Employee Name: " + name);
    System.out.println("Basic Salary: " + basicSalary);
    System.out.println("HRA: " + hra);
    System.out.println("DA: " + da);
    System.out.println("Deductions: " + deductions);
    System.out.println("Net Salary: " + netSalary);
    System.out.println("------------------------------");
  }
}