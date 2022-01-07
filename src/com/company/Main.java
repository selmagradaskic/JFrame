package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Best program in the world");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
        jFrame.setVisible(true);
        jFrame.setSize(600,500);
        jFrame.setResizable(true); //not neccecary
        jFrame.getContentPane().setBackground(new Color(200,200,200));
        ImageIcon imageIcon = new ImageIcon("Kitty.jpg");
        jFrame.setIconImage(imageIcon.getImage());
        jFrame.setVisible(true);
        //jFrame.setLayout(null);
        jFrame.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea();
        textArea.setText("Soft kitty, warm kitty, " +
                "Little ball of fur. " +
                "Happy kitty, sleepy kitty, " +
                "Purr, purr, purr. " +
                "BAZINGA, that's all!");

        textArea.setBounds(50,50,500,300);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(200,200,200));
        textArea.setBorder(BorderFactory.createBevelBorder(1)); //type 1 - dented
        textArea.setForeground(new Color(55,55,55));
        textArea.setFont(new Font("Comic Sans",Font.ITALIC,20));
        textArea.setEditable(false); //can't edit in app

        JScrollPane jScrollPane = new JScrollPane(textArea); //for scrolling text down
        jScrollPane.setPreferredSize(new Dimension(200,140));
        jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);



        //J Label


        ImageIcon image1 = new ImageIcon("Kitties.jpg");
        JLabel jLabel = new JLabel("What's up?",image1,JLabel.CENTER);
        jLabel.setVerticalAlignment(JLabel.TOP);
        jLabel.setHorizontalAlignment(JLabel.LEFT);
        jLabel.setVerticalTextPosition(JLabel.BOTTOM);
        jLabel.setHorizontalTextPosition(JLabel.CENTER);
        jLabel.setForeground(new Color(25,75,50));
        jLabel.setFont(new Font("MV Boli",Font.BOLD,25));


        JPanel jPanel = new JPanel();
        jPanel.setBounds(50,75,300,300);
        jPanel.setBackground(new Color(150,150,150));
        jPanel.setBorder(BorderFactory.createBevelBorder(0));
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jLabel);




        // jFrame.add(textArea);
        jFrame.add(jScrollPane);

        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }
}
