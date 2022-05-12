//3. Read a year from user to find it is as a leap year or not
import java.lang.*;
import java.util.*;

class a3
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("enter year");
       year=sc.nextInt();
        boolean leap=false;
        if(year%4==0)
        
        {
            if(year%400==0)
            leap=true;
            else leap=false;
        }
        
    
    // else leap=false;
    if(leap)
    System.out.println(year+"is a leap year");
    else
    System.out.println(year+"is not a leap year");

    }
}
/* if the year is divided by 4
    if (year % 4 == 0) {

      // if the year is century
      if (year % 100 == 0) {

        // if year is divided by 400
        // then it is a leap year
        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      // if the year is not century
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
  }
}*/