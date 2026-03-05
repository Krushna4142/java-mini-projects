import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {

  public static void main(String[] args) {

    try {

      BufferedReader reader = new BufferedReader(new FileReader("data.txt"));

      String line;

      System.out.println("Reading file content:\n");

      while ((line = reader.readLine()) != null) {

        System.out.println(line);

      }

      reader.close();

    } catch (Exception e) {

      System.out.println("Error while reading file.");

    }
  }
}