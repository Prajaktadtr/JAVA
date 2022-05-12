// Java Simple StringTokenizer Sample Code

import java.util.StringTokenizer;
 
public class MyStringTokenizer {
    public static void main(String a[]){
        String msg = "This program gives sample code for String Tokenizer";
        StringTokenizer st = new StringTokenizer(msg," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}