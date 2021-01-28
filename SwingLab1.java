/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class SwingLab1 extends JFrame{
    SwingLab1()
    {
        setTitle("222_Moitrish Datta");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(451,225,1000,600);
        JTabbedPane p=new JTabbedPane();
        JPanel p1=Silver1();
        JPanel p2=Silver2();
        JPanel p3=Silver3();
        p.addTab("Silver Goa Delight", null,p1);
        p.addTab("Silver Shimla Delight", null,p2);
        p.addTab("Silver Rajasthan Delight", null,p3);
        add(p,null);
    }
    public JPanel Silver1()
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,255,224));
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/goa.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(400,0,600,400);
        //l1.setOpaque(false);
        p1.add(l1);
        
        //p1.setLayout(new FlowLayout());
        JLabel l2=new JLabel("Give a toast to your life,enjoy the beaches and a collection of chuches which would give your mind a bliss");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma",Font.ITALIC,20));
        l2.setBounds(30,415,1000,30);
        //l2.setOpaque(false);
        p1.add(l2);
        
        JLabel l3=new JLabel("Exotic 4 nights & 5 days stay");
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tahoma",Font.ITALIC,20));
        l3.setBounds(30,20,380,30);
        p1.add(l3);
        
        JLabel l4=new JLabel("Only at 60,000 INR/head");
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma",Font.ITALIC,20));
        l4.setBounds(40,100,380,30);
        p1.add(l4);
        JButton b=new JButton("Book Now");
        b.setBounds(100,200,100,30);
        p1.add(b);
        
        JLabel l5=new JLabel("Click on 'Book Now' IMMEDIATELY!!");
        l5.setForeground(Color.RED);
        l5.setFont(new Font("Tahoma",Font.ITALIC,20));
        l5.setBounds(40,300,380,30);
        p1.add(l5);
        return p1;
        
    }
    public JPanel Silver2()
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,255,224));
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/shimla.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(400,0,600,400);
        //l1.setOpaque(false);
        p1.add(l1);
        
        //p1.setLayout(new FlowLayout());
        JLabel l2=new JLabel("Where the whirling clouds embrace the hill with love,we mortals call it heaven");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma",Font.ITALIC,20));
        l2.setBounds(30,415,1000,30);
        //l2.setOpaque(false);
        p1.add(l2);
        
        JLabel l3=new JLabel("Exotic 6 nights & 7 days stay");
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tahoma",Font.ITALIC,20));
        l3.setBounds(30,20,380,30);
        p1.add(l3);
        
        JLabel l4=new JLabel("Only at 60,000 INR/head");
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma",Font.ITALIC,20));
        l4.setBounds(40,100,380,30);
        p1.add(l4);
        JButton b=new JButton("Book Now");
        b.setBounds(100,200,100,30);
        p1.add(b);
        
        JLabel l5=new JLabel("Click on 'Book Now' IMMEDIATELY!!");
        l5.setForeground(Color.RED);
        l5.setFont(new Font("Tahoma",Font.ITALIC,20));
        l5.setBounds(40,300,380,30);
        p1.add(l5);
        return p1;
        
    }
    public JPanel Silver3()
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,255,224));
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/rajasthan.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(400,0,600,400);
        //l1.setOpaque(false);
        p1.add(l1);
        
        //p1.setLayout(new FlowLayout());
        JLabel l2=new JLabel("Don't be bore!! Come'on visit the historical Rajasthan like a RAJA!!");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma",Font.ITALIC,20));
        l2.setBounds(70,415,1000,30);
        //l2.setOpaque(false);
        p1.add(l2);
        
        JLabel l3=new JLabel("Exotic 7 nights & 8 days stay");
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tahoma",Font.ITALIC,20));
        l3.setBounds(30,20,380,30);
        p1.add(l3);
        
        JLabel l4=new JLabel("Only at 60,000 INR/head");
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Tahoma",Font.ITALIC,20));
        l4.setBounds(40,100,380,30);
        p1.add(l4);
        JButton b=new JButton("Book Now");
        b.setBounds(100,200,100,30);
        p1.add(b);
        
        JLabel l5=new JLabel("Click on 'Book Now' IMMEDIATELY!!");
        l5.setForeground(Color.RED);
        l5.setFont(new Font("Tahoma",Font.ITALIC,20));
        l5.setBounds(40,300,380,30);
        p1.add(l5);
        return p1;
        
    }
    public static void main(String []args)
    {
     SwingLab1 sl=new SwingLab1();
     sl.setVisible(true);
    }
    
}
