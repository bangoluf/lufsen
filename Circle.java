import java.util.Scanner;

public class Circle
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      final double PI = 3.14159;
      System.out.print("Enter the radius: ");
      double radius = kb.nextDouble();
      double area = PI * (radius * radius);
      System.out.println("The area of a circle with radius " + radius + " is " + area);
   }
}