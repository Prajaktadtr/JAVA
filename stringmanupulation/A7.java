//program to count Alphabets,number,special character and space
import java.util.Scanner;
public class CountAlphabetsNumOthers{
public static void main(String args[]){
//variable declaration
    String str;
int Alphabets=0,num=0,space=0,Special=0;
//vriable declaration and initialization
 Scanner scan=new Scanner(System.in); 
    //create a scanner object for input
    
System.out.println("Enter the String  ");
str=scan.nextLine();
for(int i=0; i<str.length(); i++){
char ch=str.charAt(i);
if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){ //Check Alphabets
    Alphabets++;
}
else if(ch>='0' && ch<='9'){ //Check numeric characters
    num++;
}
else if(ch ==' '){ //check space
    space++;
}
else{   //find the special caracters
    Special++;
}
}
System.out.println("\nAlphabet letters: "+Alphabets);
System.out.println("Number: "+num);
System.out.println("Space: "+space);
System.out.println("Special characters: "+Special);
}
}