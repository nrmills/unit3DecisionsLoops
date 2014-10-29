import java.util.Scanner;
import java.util.Random;
public class SwapLetters
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);     
        System.out.print("Enter a word:");
        String word = in.next();
        Random random = new Random();
        int x = 0;
        while (x<=word.length())
        {           
            int j = random.nextInt(word.length()-1);
            if (j==0)
            {
                j++;
            }
            int i = random.nextInt(j); 
            String first = word.substring(0,i);
            String middle = word.substring(i,j);
            String last = word.substring(j,word.length());
            word = first + word.charAt(j) + middle + word.charAt(i) + last;
            x++;
        }
        System.out.println(word);        
    }
}
