import java.util.Scanner;

public class SumAndAverageValue
{
    public static void main(String[] args)
    {
        double total = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter multiple numbers or \"q\" to quit:");

        while (scan.hasNextDouble())
        {
            double value = scan.nextDouble();
            total += value;
            count ++;
        }

        double average = 0;
        if (count > 0)
        {
            average = total / count;
        }
        System.out.println("Total: " + total + "\nAverage: " + average);
    }
}