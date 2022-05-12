/*2. Construct a Swing based GUI for the following
 * Read a String to print reverse
 * Read a No to find its digital sum
 * Read a String a find no of vowels and consonants in it
 * Read a String to convert its case*/
import java.awt.*; // AWT Components
import java.awt.event.*; // Event Handeling 
import javax.swing.*; // SWING library
/**
 *
 * @author Axiom Director
 */
public class A1 extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    // Declare GUI components 
    JLabel jlb1,jlb2,jlb4;
    JTextField jtf1,jtf3;
    JButton jbt1,jbt2,jbt3,jbt4,jbt5;
    Container cp;
    // Define Constructor 
    public A1(String title)
    {
        // initialise Frame properties 
        super(title); // Sets a Title of frame
        this.setSize(1200, 1000); // Sets a Size of a JFrame 
        cp=getContentPane();
        cp.setLayout(null); // nullify the default layout - flow
        cp.setBackground(Color.GRAY); // sets a Background color to cyan
        Font f=new Font("arial",Font.BOLD,20);

        // Initialise GUI Components 
        // initialise labels
         jlb1=new JLabel("String Manupulation");
         jlb2=new JLabel("Enter String");
        //  jlb3=new JLabel("Enter Second No");
         jlb4=new JLabel("Result");
       
         // initialise TextField
         jtf1=new JTextField();
        //  jtf2=new JTextField();
         jtf3=new JTextField();
         // Initialise Buttons 
         jbt1=new JButton("Reverse string");
         jbt2=new JButton("No of vowels");
         jbt3=new JButton("No of consonnents");
         jbt4=new JButton("Change Case");
         jbt5=new JButton("Refresh");
         // Set font of all components 
         jlb1.setFont(f);jlb2.setFont(f);jlb4.setFont(f);
         jtf1.setFont(f);jtf3.setFont(f);
         jbt1.setFont(f);jbt2.setFont(f);jbt3.setFont(f);jbt4.setFont(f);jbt5.setFont(f);
         // Set a foreground Color
         jlb1.setForeground(Color.red);jlb2.setForeground(Color.red);
        //  jlb3.setForeground(Color.red);
         jlb4.setForeground(Color.red);
         jtf1.setForeground(Color.red);
         //jtf2.setForeground(Color.red);
         jtf3.setForeground(Color.red);
         jbt1.setForeground(Color.red);jbt2.setForeground(Color.red);jbt3.setForeground(Color.red);
         jbt4.setForeground(Color.red);jbt5.setForeground(Color.red);
         // Sets Bounds of componets 
         jlb1.setBounds(400, 100, 250, 30);
         jlb2.setBounds(200, 150, 250, 30);jtf1.setBounds(500,150, 150,30);
         // jlb3.setBounds(200, 200, 250, 30);//jtf2.setBounds(500,200, 150,30);
         jlb4.setBounds(200, 250, 250, 30);jtf3.setBounds(500,250, 150,30);
         jbt1.setBounds(100, 400, 300, 30);jbt2.setBounds(500, 400, 300, 30);
         jbt3.setBounds(100, 500, 300, 30);jbt4.setBounds(500, 500, 300, 30);
         jbt5.setBounds(100, 700, 150, 30);
        cp.add(jlb1);cp.add(jlb2);//cp.add(jlb3);
        cp.add(jlb4);
        cp.add(jtf1);//cp.add(jtf2);
        cp.add(jtf3);
        jbt1.addActionListener(this);jbt2.addActionListener(this);
        jbt3.addActionListener(this);jbt4.addActionListener(this);
        jbt5.addActionListener(this);
        
        
        cp.add(jbt1);cp.add(jbt2);cp.add(jbt3);cp.add(jbt4);cp.add(jbt5);
        
      
        
        this.setVisible(true); // makes a frame visible 
    }
    
    // Process Button Events 
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==jbt1)
        {
            String str=(jtf1.getText().toString());//logic for reversing the string
            String rstr="";
            char ch;
           /* for(int i=str.length()-1;i>0;i--)
            {
                rstr+=str.charAt(i);
            }*/
            for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        rstr= ch+rstr; //adds each character in front of the existing string
      }
            jtf3.setText(rstr+""); 
        }
        else if(ae.getSource()==jbt2)
        {
            String str=(jtf1.getText().toString());
            int vc=0;//logic for counting no of vowels and consonants
             for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' ||ch=='o' || ch=='O' || ch=='u' || ch=='U')
                vc++;

            }
            jtf3.setText(vc+"");
        }
        else if(ae.getSource()==jbt3)
        {
            String str=(jtf1.getText().toString());
            int count=0;
            for (int i=0 ; i<str.length(); i++){
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                   System.out.print("");
                }else if(ch != ' '){
                   count++;
                }
             }
             jtf3.setText(count+"");
        }
        else if(ae.getSource()==jbt4)
        {
            String str=(jtf1.getText().toString());
            String cstr="";//logic for converting the case
             for(int i=0;i<str.length();i++)
             {
                 int n=(int)str.charAt(i);
                 if(n>=65 && n<=96)
                 n+=32;
                 else if(n>=97 && n<=123)
                  n-=32;
                  cstr+=(char)n;
        
             }
            
             jtf3.setText(cstr+"");
        }
        else if(ae.getSource()==jbt5)
        {
            jtf1.setText(null); jtf3.setText(null);
            
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        new A1("String Manupulation");
    }
    
}