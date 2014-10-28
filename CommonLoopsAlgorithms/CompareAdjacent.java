import java.util.Scanner;

public class CompareAdjacent
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a series of numbers (type 'q' to quit)");
        
        final double EPSILON = 1e-14;
        double prevValue = in.nextDouble();
        
        while (in.hasNextDouble())
        {
            double value = in.nextDouble();
            if ( Math.abs(value-prevValue) < EPSILON)
            {
                System.out.println("Duplicate Number");
            }
            prevValue = value;
        }
    }
}