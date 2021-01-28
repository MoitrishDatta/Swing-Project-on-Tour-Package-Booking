/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.io.*;
public class Packagetour extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JTextArea ta1;
    JButton s,r,c;
    Choice c1;
    Packagetour()
    {
        setTitle("222_Moitrish Datta");
        setLayout(null);
        setBounds(500,200,700,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255,239,213));
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,700,700);
        p1.setBackground(new Color(255,239,213));
        add(p1);
        
        l1=new JLabel("User Name");
        l1.setBounds(60,40,100,15);
        l1.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        p1.add(l1);
        
        t1=new JTextField();
        t1.setBorder(BorderFactory.createEmptyBorder());
        t1.setBounds(300,35,200,25);
        p1.add(t1);
        
        l2=new JLabel("Enter Aadhar Card Number");
        l2.setBounds(40,80,200,15);
        l2.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        p1.add(l2);
        
        t2=new JTextField();
        t2.setBorder(BorderFactory.createEmptyBorder());
        t2.setBounds(300,75,200,25);
        p1.add(t2);
        
        l3=new JLabel("Package Selection");
        l3.setBounds(50,160,200,15);
        l3.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        p1.add(l3);
        
        
        c1=new Choice();
        c1.add("Bronze Package");
        c1.add("Silver Package");
        c1.add("Golden Package");
        c1.setBounds(300,155,200,25
        );
        p1.add(c1);
        
        ta1=new JTextArea();
        ta1.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        ta1.setBounds(60,200,200,200);
        ta1.setLineWrap(true);
        p1.add(ta1);
        
        s=new JButton("Submit");
        s.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        s.setBounds(60,450,100,25);
        s.addActionListener(this);
        p1.add(s);
        
        r=new JButton("Reset");
        r.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        r.setBounds(200,450,100,25);
        r.addActionListener(this);
        p1.add(r);
        
        c=new JButton("Cancel");
        c.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        c.setBounds(350,450,100,25);
        c.addActionListener(this);
        p1.add(c);
        
        l4=new JLabel();
        l4.setFont(new Font("SAN_SERIF",Font.PLAIN,15));
        l4.setBounds(60,500,400,25);
        p1.add(l4);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String data="abc";
        try{
        if(ae.getSource()==s)
        {
            if(t1.getText().equals("") || t2.getText().equals("")){
                l4.setText("User Name and Aadhar Card number, both must be entered");
            }
            else
            {   l4.setText("");
                
                if(c1.getItem(c1.getSelectedIndex()).equals("Bronze Package"))
                {
                    new SwingLab().setVisible(true);
                    ta1.setText("Puri\n"+"Darjeeling\n"+"Murshidabad\n");
                }
                
                if(c1.getItem(c1.getSelectedIndex()).equals("Silver Package"))
                {
                    new SwingLab1().setVisible(true);
                    ta1.setText("Goa\n"+"Shimla\n"+"Rajasthan\n");
                }
                if(c1.getItem(c1.getSelectedIndex()).equals("Golden Package"))
                {
                    new SwingLab2().setVisible(true);
                    ta1.setText("Thailand\n"+"Switzerland\n"+"Egypt\n");
                }
            }
            
        }
        if(ae.getSource()==r)
        {
            String s="";
            t1.setText(s);
            t2.setText(s);
            ta1.setText(s);
        }
        if(ae.getSource()==c)
        {
            System.exit(0);
        }
        }
        catch(NullPointerException e)
        {
            System.out.print(data);
        }
    }
    public static void main(String []args)
    {
        new Packagetour().setVisible(true);
    }
}
