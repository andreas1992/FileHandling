import java.io.*;
import java.lang.*;
import java.util.*;

public class WriteToFile {
  private Formatter x;

  public WriteToFile() {

  }

  public void openFile() {
    try {
      x = new Formatter("test.txt");
    }
    catch(Exception e) {
      System.out.println("You have an error");
    }
  }

  public void addRecords() {
    x.format("%s%s%s", "Andreas ", "Kjaerner-Semb", ", ");
  }

  public void closeFile() {
    x.close();
  }
}
