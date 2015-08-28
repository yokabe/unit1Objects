import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
    public static void mian(String[] args) throws Exception
    {
        URL imageLocation = new URL("http://static.wixstatic.com/media/4b01f7_6c96f01ca872473d946b35e1e46f51e6.jpg_srz_157_149_75_22_0.50_1.20_0.00_jpg_srz");
        JOptionPane.showMessageDialog(null, "Life is best spent with brown people", "Sleep is love, Sleep is life", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}
        
        