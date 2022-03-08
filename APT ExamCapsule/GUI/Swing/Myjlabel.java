import java.awt.Color;

import javax.swing.*;
public class Myjlabel {
    public static void main(String[] agrs){
    JFrame frame = new JFrame();
    frame.setSize(700,700);
    frame.setVisible(true);
    JLabel label  = new JLabel();
    label.setSize(150,100);
    label.setText("This is a JLabel text inside JFrame");
    frame.add(label);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }

}
