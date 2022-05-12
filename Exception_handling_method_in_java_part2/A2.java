//example of throws exception
// Java program to demonstrate the working
// of throws keyword in exception handling
import java.io.*;
import java.util.*;
  
public class A2
 {
  
    public static void writeToFile() throws Exception
    {
        BufferedWriter bw = new BufferedWriter(
            new FileWriter("myFile.txt"));
        bw.write("Test");
        bw.close();
    }
  
    public static void main(String[] args) throws Exception
    {
        try {
            writeToFile();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}