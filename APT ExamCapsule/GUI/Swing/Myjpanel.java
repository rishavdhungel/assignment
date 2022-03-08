import java.awt.Color;

import javax.swing.*;
public class Myjpanel {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setBackground(Color.white);
        frame.setVisible(true);
        frame.setTitle("Jpanel Example");
        //set labelfor each panel
        JLabel redLabel = new JLabel();
        redLabel.setText("RED Panel");
        JLabel greenLabel = new JLabel();
        greenLabel.setText("Green Panel");

        JLabel blueLabel = new JLabel();
        blueLabel.setText("Blue Panel");

        JLabel yellowLabel  = new JLabel();
        yellowLabel.setText("Yellow Panel");


        //redpanel
        JPanel redpanel = new JPanel();
        redpanel.setBounds(0,0,250,250);
        redpanel.setBackground(Color.RED);
        redpanel.add(redLabel);
        frame.add(redpanel);
        //greenpanel
        JPanel greenpanel = new JPanel();
        greenpanel.setBounds(0,250,250,250);
        greenpanel.setBackground(Color.GREEN);
        greenpanel.add(greenLabel);
        frame.add(greenpanel);
        //bluepanel
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.add(blueLabel);
        frame.add(bluePanel);
        //yellowpanel
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBounds(250,250,250,250);
        yellowPanel.add(yellowLabel);
        yellowPanel.setBackground(Color.YELLOW);
        frame.add(yellowPanel);

        //set exit operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
