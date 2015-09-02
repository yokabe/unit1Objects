import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        //Option A
        Random number = new Random();
        
        int num = number.nextInt(7);
        
        System.out.println(num);
        
        //Option B
        double dieValue2 = Math.random(); // returns [0,1)
        dieValue2 *= 6;
        dieValue2 += 1;
        System.out.println( (int) dieValue2 );
        
    }
}