import java.util.*;

public class CreateFile {
  public static void main(String[] args) {
    final Formatter x;

    try {
      x = new Formatter("testText.txt");
      System.out.println("You created a file");
    }
    catch(Exception e) {
      System.out.println("You got an error");
    }
  }
}
