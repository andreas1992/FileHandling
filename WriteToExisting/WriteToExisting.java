import java.io.*;
import java.util.*;
import java.lang.*;
import java.sql.*;

public class WriteToExisting {

  private File log = new File("log.txt");
  private Timestamp timestamp = new Timestamp(System.currentTimeMillis());

  public WriteToExisting() {

  }

  public void writeToFile() {
    try {
      if(!log.exists()) {
        System.out.println("We had to make a new file.");
        log.createNewFile();
      }

      FileWriter fileWriter = new FileWriter(log, true);

      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write("***** " + timestamp.toString() + "****** " + "\n");
      bufferedWriter.close();

      System.out.println("Done");
    }
    catch (IOException e) {
      System.out.println("Error, could not log");
    }
  }
}
