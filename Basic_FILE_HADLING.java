import java.io.*;

public class Basic_FILE_HADLING {
  public static void main(String args[]) throws IOException {
    File fileName = new File("C:\\Users\\hp\\Downloads\\[CSE3141] Attendance - Sheet1 (1).csv");

    FileInputStream inFile = new FileInputStream("C:\\Users\\hp\\Downloads\\[CSE3141] Attendance - Sheet1 (1).csv");
    int fileLength = (int) fileName.length();

    byte Bytes[] = new byte[fileLength];

    System.out.println("File size is: " + inFile.read(Bytes));

    String file1 = new String(Bytes);
    System.out.println("File content is:\n" + file1);

    FileOutputStream outFile = new FileOutputStream("C:\\Users\\hp\\Desktop\\Untitled.txt");

    for (int i = 0; i < fileLength; i++) {
      outFile.write(Bytes[i]);
    }

    System.out.println("File copied.");
    // close files
    inFile.close();
    outFile.close();
  }
}