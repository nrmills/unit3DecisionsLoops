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
        int length = word.length();
        int x = 0;
        while (x<=length)
        {           
            int j = random.nextInt(word.length()-2)+2;
            int i = random.nextInt(j);
            String first = word.substring(0,i);
            String middle = word.substring(i+1,j);
            String last = word.substring(j+1,word.length());
            word = first + word.charAt(j) + middle + word.charAt(i) + last; 
            x+= 1;
        }
        System.out.println(word);        
    }
}
