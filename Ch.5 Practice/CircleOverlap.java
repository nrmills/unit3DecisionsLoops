import java.util.Scanner;
public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;
      double distanceBetweenX = Math.abs(xcenter2-xcenter1);
      
      if (radius2 > distanceBetweenX+radius1 || radius1 >distanceBetweenX+radius2)
      {
          System.out.println("The two circles are mutually contained!");
      }
      else if (radius1 + radius2 >= distanceBetweenX)
      {
          System.out.println("The two circles are overlapping!");
      }
      else
      {
          System.out.println("The two circles are disjointed1");
      }
   }
}