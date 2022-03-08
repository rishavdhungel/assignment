import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Eventhandle {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add button
        JButton btn1, btn2;
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        
        //creating panel
        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        //add panel to frame
        frame.add(greenpanel);
        //
        GroupLayout grouplayout = new GroupLayout(greenpanel);

        JLabel label = new JLabel();
        greenpanel.add(btn1);
        greenpanel.add(btn2);
        greenpanel.add(label);
        //adding action listner
        btn1.addActionListener(e->label.setText("Button 1 was pressed"));
        btn2.addActionListener(e->label.setText("Button 2 was pressed"));
        btn2.addActionListener(e->greenpanel.setBackground(Color.RED));

        


    }
}
