//Program: How to read all elements in vector by using Enumeration?
import java.util.Enumeration;
import java.util.Vector;
 
public class VectorEnnumaration {
 
    public static void main(String a[]){
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        Enumeration<String> enm = vct.elements();
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }
}