
package javaapplication6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;
public class JavaApplication6 {
    public static void main(String[] args) {
        JFrame f=new JFrame("Testing");
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        JLabel l1,l2,email;
        JTextField t1,t2,t3;
        JButton b;
        b=new JButton("Generate Email");
        t1=new JTextField("");
        t2=new JTextField("");
        t3=new JTextField("");
        t1.setBounds(50,50,100,20);
        t2.setBounds(50,90,100,20);
        t3.setBounds(50,170,200,20);
        l1=new JLabel("First Name");
        l2=new JLabel("LastName");
        email=new JLabel("Email Generated");
        l1.setBounds(50,30,100,20);
        l2.setBounds(50,70,100,20);
        email.setBounds(50,150,100,20);
        b.setBounds(50,120,120,20);
        b.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           String a=t1.getText();
           String b=t2.getText();
           Random rand =new Random();
         
           t3.setText(a+b+rand.nextInt(1000)+"@gmail.com");
           
        }
    });
        f.add(l1);
        f.add(l2);
        f.add(email);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b);
    }
    
}
