import java.awt.*;
import javax.swing.*;
public class Borderlay{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);

        //lets add panel to the borderlayout

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel blackPanel = new JPanel();
        blackPanel.setBackground(Color.BLACK);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        //create borderlayout 
        //add border
        frame.setLayout(new BorderLayout(10,10));
        //adding panel to the layout
        frame.add(redPanel,BorderLayout.NORTH);
        frame.add(blackPanel,BorderLayout.SOUTH);
        frame.add(greenPanel,BorderLayout.EAST);
        frame.add(yellowPanel,BorderLayout.CENTER);
        frame.add(bluePanel,BorderLayout.WEST);

        //close the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
