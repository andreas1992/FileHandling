import java.io.File;

public class FileReader {

  public static void main(String args[]) {
    File x = new File("C:\\Users\\Andreas\\Documents\\Programmering\\someTest.txt");

    if(x.exists()) {
      System.out.println(x.getName() + " exist!");
    }
    else {
      System.out.println("This thing does not exist");
    }
  }

}
