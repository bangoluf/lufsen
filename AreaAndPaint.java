//***************************************************************
// File:
// AreaAndPaint.java
//
//***************************************************************
import java.util.Scanner;
public class AreaAndPaint
{
   public static void main(String[] args)
   {
      final int COVERAGE = 3; // täcker 3 kv meter/liter
      int length; // deklarera variabler för längd och bredd, av typen int
      int width;
      double area; // deklarera variabel för area
      double antal_liter_farg; // deklarera variabel för antal_liter_farg, vilken typ är rätt?

      Scanner tangentbord = new Scanner(System.in); // deklarera och skapa Scanner objekt
      System.out.print("Skriv längden på rektangeln: "); // skriv ut instruktion till användaren och läs in längden från tangentbordet till din variabel
      length = tangentbord.nextInt();
      System.out.print("Skriv bredden på rektangeln: "); // skriv ut instruktion till användaren läs in bredden från tangentbordet till din variabel
      width = tangentbord.nextInt();

      area = length * width; // beräkna area rektangel
      antal_liter_farg = area / COVERAGE; // beräkna antal literfärg
      System.out.println("Du behöver " + antal_liter_farg + " liter färg."); // skriv ut resultatet
}
   }