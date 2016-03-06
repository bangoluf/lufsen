import java.util.*;

public class Time
{
   public static void main( String [] cmdln)
   {
      System.out.println("Mata in antal sekunder");
      Scanner scan = new Scanner(System.in);
      int seconds = scan.nextInt(); // anrop av en metod
      computeTime(seconds);
   }
      
// definition (skapande) av en metod
   public static void computeTime(int sec)
   {
      int sekunderTimmar = sec / 3600;                            
      int resterandeTimmar = sec % 3600;
      int sekunderMinuter = resterandeTimmar / 60;                             
      int sekunder = resterandeTimmar % 60;
      System.out.println("Total tid i timmar, minuter och sekunder: " 
      + sekunderTimmar + " Timmar " + sekunderMinuter + " Minuter " + sekunder + " Sekunder.");    
}
   }