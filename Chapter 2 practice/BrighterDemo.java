import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame frame= new JFrame();
        frame.setSize(200, 200);
        Color blue = Color.BLUE;
        Color myColor = blue.brighter();
        
        frame.getContentPane().setBackground(blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}