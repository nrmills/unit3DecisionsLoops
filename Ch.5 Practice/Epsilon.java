import java.util.Scanner;

//Nic Mills
//Epsilon practice (Comparing doubles and floats)

public class Epsilon
{
    public static void main(String[] args)
    {
        final double EPSILON = 1e-14;
        Scanner in = new Scanner(System.in);

        System.out.print("How Many Tests Would You Like to Run: ");
        int numTests = in.nextInt();

        for(int x=0; x< numTests; x = x+1)
        {
            System.out.print("Enter A Floating-Point Number: ");
            double num = in.nextDouble();
            
            String magnitude = "";
            
            if (Math.abs(num) < 1.0)
            {
                magnitude = "small";
            }
            if (Math.abs(num) > 1000000.0)
            {
                magnitude = "large";
            }
            if (Math.abs(num - 0) < EPSILON) // num == 0
            {
                System.out.println("its a zero.");
            }
            else if(num>0)
            {
                System.out.println("Its a "+magnitude+" positive number");
            }
            else
            {
                System.out.println("Its a "+magnitude+" negative number");
            }
        }
    }
}