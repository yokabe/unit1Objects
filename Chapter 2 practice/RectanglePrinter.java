import java.awt.Rectangle;

public class RectanglePrinter
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        
        Rectangle r2 = r1;
        r2.grow(10,20);
        
        System.out.println(r1);
        System.out.println(r2);
       
       Rectangle box = new Rectangle(5,10,20,30);
       box.add(0,0);
       System.out.println(box);
    }
    
}