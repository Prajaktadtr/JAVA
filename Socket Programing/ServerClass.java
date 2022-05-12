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
public class ServerClass {
    public ServerClass()
    {
        try
        {
            ServerSocket ss = new ServerSocket(5000);
            while(true)
            {
                Socket s = ss.accept();
                System.out.println("connection got...");
                while(true)
                {
                   
                    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                    String cleintData = br.readLine();
                    System.out.println(cleintData);
                    PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
                     Scanner sc = new Scanner(System.in);
                    String data = sc.nextLine();
                    pw.println(data);
                    System.out.println("data send...");
                }
            }
        }catch(IOException e)
        {
            System.out.println(" "+e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        new ServerClass();
    }
    
}

