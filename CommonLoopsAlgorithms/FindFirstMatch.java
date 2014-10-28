import java.util.Scanner;

public class FindFirstMatch
{
    /**
     * Computes the index of the first space (' ') in the string, if any
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String statement;
        int index = 0;
        char ch = 'e';

        //inputs the string to search in
        System.out.print("Enter a string: ");
        statement = in.nextLine();

        while (index < statement.length())
        {
            ch = statement.charAt( index );
            if (ch == ' ')
            {
                break;
            }
            index++;
        }

        if (ch == ' ')
        {
            System.out.println("Index of first space: " + index);
        }
        else
        {
            System.out.println("Specified character is not found");
        }
    }
}