public class Student {

  private int rollNumber;
  private String name;
  private double marks;
  private String grade;

  // Constructor
  public Student(int rollNumber, String name, double marks) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.marks = marks;
    this.grade = calculateGrade(marks);
  }

  // Grade Calculation
  private String calculateGrade(double marks) {
    if (marks >= 90)
      return "A+";
    else if (marks >= 75)
      return "A";
    else if (marks >= 60)
      return "B";
    else if (marks >= 50)
      return "C";
    else
      return "F";
  }

  // Getters
  public int getRollNumber() {
    return rollNumber;
  }

  public String getName() {
    return name;
  }

  public double getMarks() {
    return marks;
  }

  public String getGrade() {
    return grade;
  }

  // Update Marks
  public void updateMarks(double newMarks) {
    this.marks = newMarks;
    this.grade = calculateGrade(newMarks);
  }

  // Display
  public void display() {
    System.out.println(rollNumber + " | " + name + " | " + marks + " | " + grade);
  }
}