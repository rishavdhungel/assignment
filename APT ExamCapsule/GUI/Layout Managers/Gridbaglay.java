import java.awt.*;
import javax.swing.*;
public class Gridbaglay{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(600,600);
        frame.setVisible(true);

        frame.setLayout(new GridBagLayout());

        //addbutton to frame
        JButton btn1,btn2,btn3;
        btn1 = new JButton("Button1");
        btn2 = new JButton("Button2");
        btn3 = new JButton("Button3");

        //adding button to frame
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        //closing frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}