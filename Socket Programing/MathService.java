// MathService.java: A basic math interface. 
// public interface MathService
//  { 
//      public double add(double firstValue, double secondValue);
//       public double sub(double firstValue, double secondValue);   
//       public double div(double firstValue, double secondValue);  
//        public double mul(double firstValue, double secondValue); 
//       } 

// PlainMathService.java: An implementation of the MathService interface. 
public class MathService implements MathService2 {

   public double add(double firstValue, double secondValue) 
   {      return firstValue+secondValue;   }  
    public double sub(double firstValue, double secondValue)
     {   
           return firstValue-secondValue; 
     }  
      public double mul(double firstValue, double secondValue)
       {   return firstValue * secondValue;
         } 
           public double div(double firstValue, double secondValue)
          {    
               if (secondValue != 0) 
                  return firstValue / secondValue;   
               return Double.MAX_VALUE; 
              }
             }

