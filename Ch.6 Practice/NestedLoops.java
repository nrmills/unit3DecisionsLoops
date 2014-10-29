
public class NestedLoops
{
    public static void main(String[] args)
    {
        //For Loop Variant
        System.out.println("For Loop Output...");
        for (int x=1;x<=2;x++)
        {
            for (int y=1;y<=4;y++)
            {
                System.out.println(x+" "+y);
            }
        }
        
        //While Loop Variant
        System.out.println("\nWhile loop Output");
        int x = 1;
        int y = 1;
        while (x<=2)
        {
            while (y<=4)
            {
                System.out.println(x+" "+y);
                y++;
            }
            x++;
            y=1;
        }
        
        
        //Do Loop Variant
        System.out.println("\nDo Loop Output");
        x=0;
        y=0;
        
        do
        {
            x++;
            do
            {
                y++;
                System.out.println(x+" "+y);
            }
            while (y<=3);
            y=0;
        }
        while (x<=1);
    }
}