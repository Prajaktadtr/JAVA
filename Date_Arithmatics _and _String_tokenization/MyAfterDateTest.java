// Program: How to check if the date is after the specified date?
import java.util.Date;
 
public class MyAfterDateTest {
     
    public static void main(String a[]){
         
        Date current = new Date();
        //create a date one day after current date
        long nextDay = System.currentTimeMillis() + 1000*60*60*24;
        //create date object
        Date next = new Date(nextDay);
        //compare both dates
        if(next.after(current)){
            System.out.println("The date is future day");
        } else {
            System.out.println("The date is older than current day");
        }
    }
}