package com.sahilpabale.javalab;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

    private JPanel contentPane;

    public static void main(String[] args) {
        new aboutUs().setVisible(true);
    }

    private static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Home.class.getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public aboutUs() {

        super("About Us");
        setBackground(new Color(173, 216, 230));
        setBounds(500, 250, 700, 300);

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("New label");
        ImageIcon i1  = createImageIcon("./icons/logo.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l1 = new JLabel(i3);
        l1.setBounds(500, 40, 100, 100);
        contentPane.add(l1);


        JLabel l3 = new JLabel("Library");
        l3.setForeground(new Color(10, 10, 120));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l3.setBounds(160, 40, 150, 55);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Management System");
        l4.setForeground(new Color(10, 10, 120));
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l4.setBounds(70, 90, 405, 40);
        contentPane.add(l4);

        contentPane.setBackground(Color.WHITE);
    }

}
