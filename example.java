package swingexample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class example
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame("Addition Tab");
        JLabel l1,l2,l3;
        JTextField t1,t2,result;
        JButton b=new JButton("add");
        b.setBounds(50,190,60,20);
        t1=new JTextField("");
        t2=new JTextField("");
        result=new JTextField("");
        result.setBounds(50,150,100,20);
        t1.setBounds(50,70,100,20);
         t2.setBounds(50,110,100,20);
        l1=new JLabel("First Number");
        l3=new JLabel("Result");
        l3.setBounds(50,130,100,30);
        l1.setBounds(50,50,100,30);
        l2=new JLabel("Second Number");
         l2.setBounds(50,90,100,30);
         b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 int n1=Integer.parseInt(t1.getText());
                 int n2=Integer.parseInt(t2.getText());
                 int sum=n1+n2;
                 String s=String.valueOf(sum);
                 result.setText(s);
             }
         });
         f.add(l1);
         f.add(l2);
         f.add(t1);
         f.add(t2);
         f.add(b);
         f.add(l3);
         f.add(result);
         f.setSize(300,300);
         f.setLayout(null);
         f.setVisible(true);
         
         
    }
}

