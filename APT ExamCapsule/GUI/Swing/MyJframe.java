import java.awt.Color;

import javax.swing.*;
public class MyJframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//creates frame
        frame.setSize(500,500);
        frame.setTitle("This is frame title");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        frame.getContentPane().setBackground(Color.gray);
    }
}
