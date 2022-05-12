import java.io.*;
public class A2 {

    public static void main(String []args) throws IOException
    {
        PrintWriter pw=new PrintWriter("C:\\Users\\Lenovo\\Desktop\\C.txt");//printwriter object for c.txt
        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\A.txt"));//buffered reader object for A.txt

        String line=br.readLine();
        //loop to copy each line of A.txt to C.txt
        while(line!=null)
        {
            pw.println(line);
            line=br.readLine();
        }
        //buffered reader object for B.txt
        br=new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\B.txt"));
        line=br.readLine();
        //loop to  copy each line of file B.txt to C.txt
        while(line!=null)
        {
            pw.println(line);
            line=br.readLine();

        }
        pw.flush();
        //closing resources
        br.close();
        pw.close();
        System.out.println("Merged A.txtand B.txt into C.txt"); 


    }
    
}
