import java.awt.Color;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.*;
public class Mybuttons {
    public static void main(String[] args){
        //setlayout to null
        
        //creating JFrame Object
        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.setTitle("JButton Example");
        frame.setVisible(true);
        frame.setLayout(null);
        //creating penel
        //creating Red Panel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,800,400);

        //create a button for Red Panel
        JButton redButton = new JButton();
        redButton.setText("Red Button");
        redButton.setSize(200,100);

        //add button to a panel
        redPanel.add(redButton);

        //create a Black Panel
        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK);
        blackPanel.setBounds(0,400,800,400);

        //create a button for black panel
        JButton blackButton = new JButton();
        blackButton.setText("Black Button");
        blackButton.setSize(200,100);

        //add a button to a  black panel
        blackPanel.add(blackButton);

        //add panel to frame
        frame.add(redPanel);
        frame.add(blackPanel);
        
        //setting on exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
