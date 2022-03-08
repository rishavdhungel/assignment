import java.awt.*;
import javax.swing.*;
public class Grouplay{
    public static void main(String[] args){
     JFrame frame =  new JFrame();
     frame.setSize(500,500);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
     //make a panel
     JPanel greenPanel = new JPanel();
     greenPanel.setBackground(Color.GREEN);;
     //select the layout
     GroupLayout grouplay = new GroupLayout(greenPanel);
     //button 
     JButton btn1,btn2;
     btn1 = new JButton("Button 1");
     btn2 = new JButton("Button 2");

     frame.add(greenPanel);
     greenPanel.add(btn1);
     greenPanel.add(btn2);

     
     frame.setVisible(true);


    }
}