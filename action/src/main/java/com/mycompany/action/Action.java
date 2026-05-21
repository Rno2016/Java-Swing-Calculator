package com.mycompany.action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action extends JFrame {

    private JLabel l1, l2;
    private JButton b1, b2;
    private JTextField t1, t2;

    public Action() {

        
        setTitle("Hi");
        setLocation(500, 270);
        setSize(250, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel();
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        
        b1 = new JButton("SUM");
        b2 = new JButton("MULT");
        
        JPanel p = (JPanel) getContentPane();
        p.setLayout(new FlowLayout());

        p.add(t1);
        p.add(t2);
        p.add(l1);
        p.add(b1);
        p.add(b2);
        
        b1.addActionListener(new sum());
        b2.addActionListener(new mult());
        
        setVisible(true);
        
    }

    public class sum implements ActionListener{


    public void actionPerformed(ActionEvent e) {
         
       int i = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
       l1.setText("= " + i);
        
        
    }
    
    }
    
    
    
    
    public class mult implements ActionListener{
    
    public void actionPerformed(ActionEvent e)
     {
        
        int i = Integer.parseInt(t1.getText()) *  Integer.parseInt(t2.getText());
       l1.setText("= " + i);
        
        
    }
    }
    
    
    public static void main(String[] args) {

      Action a = new Action();

      
    }
}