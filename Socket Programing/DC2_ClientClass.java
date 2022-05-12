/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
// package project.chating;
import java.net.*;
import java.util.*;
import java.io.*;
/**
 *
 * @author new
 */
public class DC2_ClientClass {
    public DC2_ClientClass()
    {
       try
       {
            Socket s = new Socket("localhost",8080);
            while(true)
            {
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
            pw.println(data);
            BufferedReader br  = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String msg = br.readLine();
            System.out.println(msg);
            }
          
       }catch(IOException e)
       {
           System.out.println(e.getMessage());
       }
    }
    public static void main(String [] args)
    {
        new ClientClass();
    }
}
