
import java.util.Scanner;

public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double wavelength;
        
        System.out.print("Enter Wavelength Value:");
        wavelength = in.nextDouble();
        
        if (wavelength < 10e-11)
        {
            System.out.println("Type:Gamma Rays \nFrequency: >3*10e19");
        }
        else if (wavelength < 10e-8)
        {
            System.out.println("Type:X-Rays \nFrequency: 3*10e16 to 3*10e19");
        }
        else if (wavelength < 4*10e-7)
        {
            System.out.println("Type:_ \nFrequency: 7.5*10e14 to 3&10e16");
        }
        else if (wavelength < 7*10e-7)
        {
            System.out.println("Type:_ \nFrequency: 4*10e14 to 7.5*10e14");
        }
        else if (wavelength < 10e-3)
        {
            System.out.println("Type:_ \nFrequency:_");
        }
        else if (wavelength < 10e-1)
        {
            System.out.println("Type:_ \nFrequency:_");
        }
        else if (wavelength < 10e_)
        {
            System.out.println("Type:_ \nFrequency:_");
        }
    }
}