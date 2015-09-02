import java.awt.Color;
import java.util.Random;


public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld = new World(); //creates the object of turtleWorld
       
        Turtle turtle1 = new Turtle(turtleWorld); //creates turtle1
        Turtle turtle2 = new Turtle(turtleWorld); //creates turtle2
        Turtle turtle3 = new Turtle(turtleWorld); //creates turtle3
        Turtle turtle4 = new Turtle(turtleWorld); //creates turtle4
        Turtle stem = new Turtle(turtleWorld); //creates the stem
        
        turtle1.setPenColor(Color.MAGENTA); //Setting the color of turtle1 to 
        turtle2.setPenColor(Color.MAGENTA); //Setting the color of turtle2 to 
        turtle3.setPenColor(Color.MAGENTA); //Sets the color of turtle3 to
        turtle4.setPenColor(Color.MAGENTA); //Sets the color of turtle 4 to
        
        stem.setPenColor(Color.GREEN);
        stem.setPenWidth(10);
        stem.penDown();
        stem.turn(100);
        stem.forward(60);
        
        turtle1.setPenWidth(5); //Sets the width of turtle1's pen at 10 pixels
        turtle2.setPenWidth(5); //Sets the width of turtle2's pen at 10 pixels
        turtle3.setPenWidth(5); //Sets the width of turtle3's pen at 10 pixels
        turtle4.setPenWidth(5); //Sets the width of turtle4's pen at 10 pixels
        /*
        turtle1.forward(20); 
        turtle2.forward(20);
        
        
        turtle3.forward(20);
        turtle4.forward(20);
        */
        turtle3.turn(180);
        turtle4.turn(180);
       
        turtle1.penDown();
        turtle2.penDown();
        turtle3.penDown();
        turtle4.penDown();
        
        turtle1.turn(25);
        turtle2.turn(335);
        
        turtle1.forward(17);
        turtle2.forward(17);
        
        turtle3.turn(25);
        turtle4.turn(335);
        
        turtle3.forward(17);
        turtle4.forward(17);
        
        int num = 1; /*Setting integer to run the while loop, 
                      and Setting the number of pixels the turtle moves forward
                      inside the while loop*/
        
        while (num <= 120)
        {
            /* This while loop has turtle1 and turtle2 move forward and turn 26 degrees to 
               opposite directions for a set time, and every successive forward movement, 
               both of the turtle move forward another 3 pixels more than the previous
               until the while loop is terminated when the argument is no longer true. This 
               motion has the turtles draw a swirl from their start point.
             */
            turtle1.forward(num);
            turtle1.turn(32);
            turtle2.forward(num);
            turtle2.turn(328);
            num = num + 1; /*Sets the variable num to a new, higher value so the turtles move
                             forward more pixels on next run through the while loop, and so the
                             while loop is getting closer to being terminated*/
                             
            
        }
        
        
        
   
        int num1 = 1; /*Setting another integer to run a different 
                      while loop, and setting the number of pixes the turtle moves 
                      inside the while loop*/
        
        while (num1 <= 120)
        {
            /* This while loop has turtle3 and turtle4 move forward and turn 26 degrees to 
               opposite directions for a set time, and every successive forward movement, 
               both of the turtle move forward another 3 pixels more than the previous
               until the while loop is terminated when the argument is no longer true. This 
               motion has the turtles draw a swirl from their start point.
             */
            turtle3.forward(num1);
            turtle3.turn(32);
            turtle4.forward(num1);
            turtle4.turn(328);
            num1 = num1 + 1; /*Sets the variable num1 to a new, higher value so the turtles move
                             forward more pixels on next run through the while loop, and so the
                             while loop is getting closer to being terminated*/
            
        }
        
        
        
        
    }
}
        