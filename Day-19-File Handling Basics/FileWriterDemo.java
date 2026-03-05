import java.io.FileWriter;

public class FileWriterDemo {

  public static void main(String[] args) {

    try {

      FileWriter writer = new FileWriter("data.txt");

      writer.write("Welcome to Java File Handling!\n");
      writer.write("This file was created using FileWriter.\n");
      writer.write("Learning Java step by step.");

      writer.close();

      System.out.println("Data successfully written to file.");

    } catch (Exception e) {

      System.out.println("Error while writing to file.");

    }
  }
}