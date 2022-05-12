// Java StringTokenizer With Multiple De-limiters Sample Code
import java.util.StringTokenizer;
 
public class MyStringTokens {
    public static void main(String a[]){
        String msg = "http://10.123.43.67:80/";
        StringTokenizer st = new StringTokenizer(msg,"://.");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
