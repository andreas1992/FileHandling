public class UsingWriteToFile {
  public static void main(String[] args) {
    WriteToFile newWrite = new WriteToFile();

    newWrite.openFile();
    newWrite.addRecords();
    newWrite.addRecords();
    newWrite.closeFile();
  }
}
