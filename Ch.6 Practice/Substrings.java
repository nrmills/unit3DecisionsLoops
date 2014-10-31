import java.util.Scanner;
public class Substrings
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.next();
        int strLength = str.length();
        int subStringLength = 1;
        while (subStringLength<=strLength)
        {
            for (int x=0; x<=strLength-subStringLength; x++)
            {
                String subString = str.substring(0+x, subStringLength+x);
                System.out.println(subString);
            }
            subStringLength++;
        }
    }
}
