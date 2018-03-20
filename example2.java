package swingexample;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class example2 {
    public static void main(String[] args)
    {
        JFrame f=new JFrame("Substraction Tab");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400,400);
        JTextField t1,t2,result;
        JButton b=new JButton("MINUS");
        b.setBounds(50,190,100,20);
      
        JLabel l1,l2,l3;
        l1=new JLabel("First Number");
        l2=new JLabel("Second Number");
        l3=new JLabel("Result");
        l1.setBounds(50,30,100,20);
        l2.setBounds(50,80,100,20);
        l3.setBounds(50,130,100,20);
        t1=new JTextField("");
        t2=new JTextField("");
        result=new JTextField("");
        t1.setBounds(50,50,100,20);
        t2.setBounds(50,100,100,20); 
        result.setBounds(50,150,100,20);
          b.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        int n1=Integer.parseInt(t1.getText());
                 int n2=Integer.parseInt(t2.getText());
                 int sum=n1-n2;
                 String s=String.valueOf(sum);
                 result.setText(s);
                    }
                });
       f.add(t1);
       f.add(t2);
       f.add(result);
       f.add(l1);
       f.add(l2);
       f.add(l3);
       f.add(b);
       
    }
    
}
