import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Diamonds would you like to Draw: ");
        int iterations = input.nextInt();
        System.out.println();

<<<<<<< HEAD
        for (int index =0; index < iterations; index++)
=======
        for (int index =0; index <= iterations; index++)
>>>>>>> origin/master
        {
            int rowNum = 1;
            int spc;
            int y = 0;
            int numA = 1;
<<<<<<< HEAD
            System.out.print("Enter the Desired Width of the Diamond- Must be an Odd Number: ");
            int width = input.nextInt()+1;
=======
            System.out.print("Enter the Desired Width of the Diamond: ");
            int width = input.nextInt();
>>>>>>> origin/master
            if (width % 2 == 0 && (width/2)%2 == 0)
            {
                spc = (width/2)-1;
            }
            else
            {
                spc = (width-1)/2;
            }

            while(rowNum<width)
            {
                //Prints the spaces before the asterisks
                for(int x=1;x<=spc;x++)
                {
                    System.out.print(" ");
                }
                //Prints asterisks
                while(y < numA)
                {
                    System.out.print("*");
                    y++;
                }
<<<<<<< HEAD
                //Prints the spaces after the asterisks- Not Needed, for visualisation
                //for(int z=1;z<=spc;z++)
                //{
                //    System.out.print(" ");
                //}
=======
                //Prints the spaces after the asterisks
                for(int z=1;z<=spc;z++)
                {
                    System.out.print(" ");
                }
>>>>>>> origin/master
                System.out.println();
                if (rowNum >= width/2)
                {
                    spc += 1;
                    numA-= 2;
                }
                else
                {
                    spc -= 1;
                    numA += 2;
                }
                rowNum +=1;
                y=0;
            }
        }
    }
}