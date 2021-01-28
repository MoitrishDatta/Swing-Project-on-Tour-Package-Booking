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
public class SwingLab extends JFrame{
    SwingLab()
    {
        setTitle("222_Moitrish Datta");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(451,225,1000,600);
        JTabbedPane p=new JTabbedPane();
        JPanel p1=Bronze1();
        JPanel p2=Bronze2();
        JPanel p3=Bronze3();
        p.addTab("Bronze PURI Delight", null,p1);
        p.addTab("Bronze KANCHENJUNGA Delight", null,p2);
        p.addTab("Bronze MUSHIRDABAD Delight", null,p3);
        add(p,null);
    }
    public JPanel Bronze1()
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,255,224));
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/puri.jpg"));
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
        
        JLabel l4=new JLabel("Only at 5000 INR/head");
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
    public JPanel Bronze2()
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,255,224));
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/darjeeling.jfif"));
        Image i2=i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(400,0,600,400);
        //l1.setOpaque(false);
        p1.add(l1);
        
        //p1.setLayout(new FlowLayout());
        JLabel l2=new JLabel("Enjoy the dazzling Himalayan range from your window,with every sip of your morning Darjeeling tea!!");
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
        
        JLabel l4=new JLabel("Only at 10,000 INR/head");
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
    public JPanel Bronze3()
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,255,224));
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/murshidabad.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(400,0,600,400);
        //l1.setOpaque(false);
        p1.add(l1);
        
        //p1.setLayout(new FlowLayout());
        JLabel l2=new JLabel("Don't be a Mir Zafar!! Come'on visit the historical Murshidabad like a Royal NAWAB!!");
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Tahoma",Font.ITALIC,20));
        l2.setBounds(70,415,1000,30);
        //l2.setOpaque(false);
        p1.add(l2);
        
        JLabel l3=new JLabel("Exotic 2 nights & 3 days stay");
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Tahoma",Font.ITALIC,20));
        l3.setBounds(30,20,380,30);
        p1.add(l3);
        
        JLabel l4=new JLabel("Only at 3,000 INR/head");
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
     SwingLab sl=new SwingLab();
     sl.setVisible(true);
    }
    
}
