//3. Create 3-4 color buttons and change background color of applet window as per button hit.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class A3 extends Applet implements ActionListener
{

    Label lb1,lb2,lb3,lb4;//promting msg
    Button bt1,bt2,bt3,bt4;//event processor
    public void init()
    {
        
        this.setLayout(null);
        this.setBackground(Color.cyan);
        Font f=new Font("arial",Font.BOLD,20);

        // lb1.setFont(f);
        lb1=new Label("welcome");
        lb1.setFont(f);
        lb1.setBounds(50,50,300,30);
        this.add(lb1);

        bt1=new Button("click me");
        bt1.setFont(f);
        bt1.addActionListener(this);//listen the event of button
        bt1.setBounds(50,100,100,30);
        this.add(bt1);

        lb2=new Label("");
        lb2.setFont(f);
        // lb2.setBounds(100,50,70,30);
        this.add(lb2);

        bt2=new Button("click me");
        bt2.setFont(f);
        bt2.addActionListener(this);//listen the event of button
        bt2.setBounds(100,150,100,30);
        this.add(bt2);

        lb3=new Label("");
        lb3.setFont(f);
        // lb3.setBounds(150,150,70,30);
        this.add(lb3);

        bt3=new Button("click me");
        bt3.setFont(f);
        bt3.addActionListener(this);//listen the event of button
        bt3.setBounds(150,200,100,30);
        this.add(bt3);

        lb4=new Label("");
        lb4.setFont(f);
        // lb4.setBounds(200,200,70,30);
        this.add(lb4);

        bt4=new Button("click me");
        bt4.setFont(f);
        bt4.addActionListener(this);//listen the event of button
        bt4.setBounds(200,250,100,30);
        this.add(bt4);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==bt1)
        {
            lb1.setText("red color");
            this.setBackground(Color.RED);
        }
        else if(ae.getSource()==bt2)
        {
            lb1.setText("green color");
            this.setBackground(Color.GREEN);
        }
        else if(ae.getSource()==bt3)
        {
            lb1.setText("pink color");
            this.setBackground(Color.PINK);
        
        }
        else if(ae.getSource()==bt4)
        {
            lb1.setText("yellow color");
            this.setBackground(Color.yellow);
        }
    }
}
