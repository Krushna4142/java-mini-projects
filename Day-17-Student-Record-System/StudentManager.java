import java.util.ArrayList;

public class StudentManager {

  private ArrayList<Student> students;

  public StudentManager() {
    students = new ArrayList<>();
  }

  // Add Student
  public void addStudent(Student student) {
    students.add(student);
    System.out.println("✅ Student added successfully!");
  }

  // View All Students
  public void viewStudents() {
    if (students.isEmpty()) {
      System.out.println("⚠ No student records found.");
      return;
    }

    for (Student student : students) {
      student.display();
    }
  }

  // Search Student by Roll Number
  public Student findStudent(int rollNumber) {
    for (Student student : students) {
      if (student.getRollNumber() == rollNumber) {
        return student;
      }
    }
    return null;
  }

  // Update Student Marks
  public void updateStudentMarks(int rollNumber, double newMarks) {
    Student student = findStudent(rollNumber);

    if (student != null) {
      student.updateMarks(newMarks);
      System.out.println("✏ Marks updated successfully!");
    } else {
      System.out.println("❌ Student not found.");
    }
  }

  // Delete Student
  public void deleteStudent(int rollNumber) {
    Student student = findStudent(rollNumber);

    if (student != null) {
      students.remove(student);
      System.out.println("🗑 Student deleted successfully!");
    } else {
      System.out.println("❌ Student not found.");
    }
  }
}