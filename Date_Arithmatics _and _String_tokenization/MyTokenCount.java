// Java StringTokenizer Token Count Sample Code
import java.util.StringTokenizer;
 
public class MyTokenCount {
    public static void main(String a[]){
        String msg = "This program gives sample code for String Tokenizer";
        StringTokenizer st = new StringTokenizer(msg," ");
        System.out.println("Count: "+st.countTokens());
    }
}
