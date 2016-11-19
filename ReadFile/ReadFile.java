import java.io.*;
import java.util.*;

public class ReadFile {

  private Scanner x;

  public ReadFile() {
    
  }

  public void openFile() {
    try {
      x = new Scanner(new File("test.txt"));
    }
    catch(Exception e) {
      System.out.println("Could not find file");
    }
  }

  public void readFile() {
    while(x.hasNext()) {
      String a = x.next();
      String b = x.next();

      System.out.printf("%s %s\n", a, b);
    }
  }

  public void closeFile() {
    x.close();
  }
}
