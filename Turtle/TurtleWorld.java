import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        
        
        int degree = 0;
        int forward = 0;
        int connor = 1;
        int connoR = 1;
        int Connor = 1;
        int cOnnor = 1;
        int COnnor = 1;
        turtle.penDown();
        while (connor <=1000)
        {
            turtle.forward(10);
            turtle.turn(10);
            connor = connor + 1;
            
        };
        turtle.turn(90);
        turtle.setPenColor(Color.RED);
        while (connoR <=1000)
        {
            turtle.forward(10);
            turtle.turn(10);
            connoR = connoR + 1;
            
        };
        turtle.turn(90);
        turtle.setPenColor(Color.PINK);
        while (Connor <=1000)
        {
            turtle.forward(10);
            turtle.turn(10);
            Connor = Connor + 1;
            
        };
        turtle.turn(90);
        turtle.setPenColor(Color.GREEN);
        while (cOnnor <=1000)
        {
            turtle.forward(10);
            turtle.turn(10);
            cOnnor = cOnnor + 1;
            
        };
        turtle.turn(90);
        turtle.setPenColor(Color.MAGENTA);
        while (COnnor <=1000)
        {
            turtle.forward(10);
            turtle.turn(10);
            COnnor = COnnor + 1;
            
        };
   }
}
