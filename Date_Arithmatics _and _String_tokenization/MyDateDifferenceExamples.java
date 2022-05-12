// Program: How to calculate difference between two dates in java?
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class MyDateDifferenceExamples {
 
    public static void main(String a[]){
         
        String startDate = "22/02/2014 12:30:00";
        String endDate = "24/02/2014 12:30:00";
         
        /**
         * SimpleDateFormat converts string format to date object
         */
        SimpleDateFormat sdFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try {
            Date startDateObj = sdFormat.parse(startDate);
            Date endDateObj = sdFormat.parse(endDate);
            // startDateObj.getTime() method gives date in milli seconds format
            System.out.println("Time in milli seconds: "+startDateObj.getTime());
             
            // find time difference in milli seconds
            long timeDiff = endDateObj.getTime() - startDateObj.getTime();
            System.out.println("Time difference in Milli seconds: "+timeDiff);
             
            // time difference in seconds
            long secondsDiff = (timeDiff/1000);
            System.out.println("Time difference in seconds: "+secondsDiff);
             
            // time difference in minutes
            long minDiff = timeDiff/(1000*60);
            System.out.println("Time difference in minutes: "+minDiff);
             
            // time difference in minutes
            long hoursDiff = timeDiff/(1000*60*60);
            System.out.println("Time difference in hours: "+hoursDiff);
             
            // time difference in minutes
            long daysDiff = timeDiff/(1000*60*60*24);
            System.out.println("Time difference in days: "+daysDiff);
             
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

