//Purpose: To draw a Pink rose/flower with green leaves/vines surrounding it with multiple turtles
//Author: Yudai Okabe (period 8)
//Date: 9/4/2015

import java.awt.Color;
import java.util.Random;


public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleWorld = new World(); //creates the object of turtleWorld
       
        Turtle stem1 = new Turtle(turtleWorld); //creates the stem1
        Turtle stem2 = new Turtle(turtleWorld); //creates the stem2
        Turtle turtle1 = new Turtle(turtleWorld); //creates turtle1
        Turtle turtle2 = new Turtle(turtleWorld); //creates turtle2
        Turtle turtle3 = new Turtle(turtleWorld); //creates turtle3
        Turtle turtle4 = new Turtle(turtleWorld); //creates turtle4
        
        
        turtle1.setPenColor(Color.MAGENTA); //Sets the color of turtle1 to magenta
        turtle2.setPenColor(Color.MAGENTA); //Sets the color of turtle2 to magenta
        turtle3.setPenColor(Color.MAGENTA); //Sets the color of turtle3 to magenta
        turtle4.setPenColor(Color.MAGENTA); //Sets the color of turtle4 to magenta
        
        
        turtle1.setPenWidth(6); //Sets the width of turtle1's pen at 10 pixels
        turtle2.setPenWidth(6); //Sets the width of turtle2's pen at 10 pixels
        turtle3.setPenWidth(6); //Sets the width of turtle3's pen at 10 pixels
        turtle4.setPenWidth(6); //Sets the width of turtle4's pen at 10 pixels
        
        stem1.setPenColor(Color.GREEN); //Sets the color of stem1 to green
        stem1.setPenWidth(10); //Sets the width of stem1 to 10 pixels
        
        stem1.penDown();
        
        int vines1 = 1; /*Declares an integer made for the purpose of running a while loop for 
                          set number of times*/
        
        while (vines1 <= 100)
        {
            /*This while loop has stem1 go through two movements for a repeated number of times
             until the integer vines1 meets the value of 100, after being added 1 to the 
             preexisting value every run through the loop.
             */
            stem1.forward(600);
            stem1.turn(125);
            vines1 = vines1 + 1; /* Adds a value of 1 to the preexisiting value of vines1 in
                                    order to progressively increase the value of vines1 to 100
                                    and terminate the while loop after the program repeates
                                    a set number of times. */
        }
        
        stem2.setPenColor(Color.GREEN); //Sets the color of stem2 to green 
        stem2.setPenWidth(10); //Sets the width of stem2 to 10 pixels
        
        stem2.turn(180);
        
        stem2.penDown();
        
        int vines2 = 1; /*Declares an integer made for the purpose of running a while loop for 
                          set number of times*/
        
        while (vines2 <= 100)
        {
             /*This while loop has stem1 go through two movements for a repeated number of times
             until the integer vines1 meets the value of 100, after being added 1 to the 
             preexisting value every run through the loop.
             */
            stem2.forward(600);
            stem2.turn(235);
            vines2 = vines2 + 1; /* Adds a value of 1 to the preexisiting value of vines2 in
                                    order to progressively increase the value of vines2 to 100
                                    and terminate the while loop after the program repeates
                                    a set number of times. */
        }
        
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
        
        int num = 1; /*Declares integer to run the while loop, 
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
            num = num + 1; /*Declares the variable num to a new, higher value so the turtles move
                             forward more pixels on next run through the while loop, and so the
                             while loop is getting closer to being terminated*/
                             
            
        }
        
        
        int num1 = 1; /*Declares another integer to run a different 
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
            num1 = num1 + 1; /*Declares the variable num1 to a new, higher value so the turtles move
                             forward more pixels on next run through the while loop, and so the
                             while loop is getting closer to being terminated*/
            
        }
        
        
    }
}
        