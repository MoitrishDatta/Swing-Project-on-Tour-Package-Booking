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
public class SwingLab2 extends JFrame{
    SwingLab2()
    {
        setTitle("222_Moitrish Datta");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(451,225,1000,600);
        JTabbedPane p=new JTabbedPane();
        JPanel p1=Gold1();
        JPanel p2=Gold2();
        JPanel p3=Gold3();
        p.addTab("Gold Thailand Delight", null,p1);
        p.addTab("Gold Switzerland Delight", null,p2);
        p.addTab("Gold Egypt Delight", null,p3);
        add(p,null);
    }
    public JPanel Gold1()
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,255,224));
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/pattaya.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(400,0,600,400);
        //l1.setOpaque(false);
        p1.add(l1);
        
        //p1.setLayout(new FlowLayout());
        JLabel l2=new JLabel("Give a toast to your life,enjoy the beaches and a collection of temples which would give your mind a bliss");
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
        
        JLabel l4=new JLabel("Only at 40,000 INR/head");
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
    public JPanel Gold2()
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,255,224));
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/switzerland.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(400,0,600,400);
        //l1.setOpaque(false);
        p1.add(l1);
        
        //p1.setLayout(new FlowLayout());
        JLabel l2=new JLabel("Enjoy the dazzling Alpine stretch from your window,with every bite of your favourite SWISS chocolate!!");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma",Font.ITALIC,20));
        l2.setBounds(30,415,1000,30);
        //l2.setOpaque(false);
        p1.add(l2);
        
        JLabel l3=new JLabel("Exotic 7 nights & 8 days stay");
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tahoma",Font.ITALIC,20));
        l3.setBounds(30,20,380,30);
        p1.add(l3);
        
        JLabel l4=new JLabel("Only at 1,40,000 INR/head");
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
    public JPanel Gold3()
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,255,224));
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/egypt.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(400,0,600,400);
        //l1.setOpaque(false);
        p1.add(l1);
        
        //p1.setLayout(new FlowLayout());
        JLabel l2=new JLabel("Don't be bore!! Come'on visit the historical Egypt like a PHAROAH!!");
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
        
        JLabel l4=new JLabel("Only at 1,00,000 INR/head");
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
     SwingLab2 sl=new SwingLab2();
     sl.setVisible(true);
    }
    
}
