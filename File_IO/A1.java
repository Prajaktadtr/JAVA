/*Create an Interface to merge two files to generate third resultant one.
C= A+B
Provided A,B are the different files with different contents , merge them to form C file*/

import java.io.*;

class A1
{
    public static void main(String []args)
    {
        File f=new File("C:\\Users\\Lenovo\\Desktop\\A.txt");
        // File=f=new File("C:\\Users\\Lenovo\\Desktop\\B.txt");
        try{
            if(f.createNewFile())
            {
                System.out.println("File Successfully created....");
            }
            else{
                System.out.println("File already exist....");
            }
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
        
       
        File f1=new File("C:\\Users\\Lenovo\\Desktop\\B.txt");
        // File=f=new File("C:\\Users\\Lenovo\\Desktop\\B.txt");
        try{
            if(f1.createNewFile())
            {
                System.out.println("File Successfully created....");
            }
            else{
                System.out.println("File already exist....");
            }
        }
        catch(IOException i)
        {
            System.out.println(i);
        }

        
        File f2=new File("C:\\Users\\Lenovo\\Desktop\\C.txt");
        // File=f=new File("C:\\Users\\Lenovo\\Desktop\\B.txt");
        try{
            if(f2.createNewFile())
            {
                System.out.println("File Successfully created....");
            }
            else{
                System.out.println("File already exist....");
            }
        }
        catch(IOException i)
        {
            System.out.println(i);
        }

        /*PrintWriter p=new PrintWriter("C:\\Users\\Lenovo\\Desktop\\C.txt");//create object of printwriter for output file
        String[] fileNames=f1.list();//get list of all the files in form of string Array

        //Loop for reading the contents of all the files in the directory
        for(String filename:fileNames)
        {
            System.out.println("Reading from "+f1);

// create instance of file from Name of
            // the file stored in string Array
            File f3 = new File(f1, f2);
 
            BufferedReader br=new BufferedReader(new FileReader(f3));
            p.println("Conternts of the file"+f1);
            //read from current file
            String line=br.readLine();
            while(line!=null)
            {
                //write to the output file
                p.println(line);
                line=br.readLine();
            }
            p.flush();
        }
        System.out.println("Reading from all files"+"in directory"+f1.getName()+"Completed");*/
    }
}