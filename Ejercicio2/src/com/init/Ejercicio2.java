package com.init;

import com.componentes.FancyButton;
import com.componentes.FancyButton2;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Frame");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        
        FancyButton button1 = new FancyButton();       
        button1.setPreferredSize(new java.awt.Dimension(200, 100));
        
        FancyButton2 button2 = new FancyButton2();
        button2.setPreferredSize(new java.awt.Dimension(200, 100));
   
        frame.getContentPane().add(button1, java.awt.BorderLayout.NORTH);
        frame.getContentPane().add(button2, java.awt.BorderLayout.SOUTH);
        
       

    }

}
