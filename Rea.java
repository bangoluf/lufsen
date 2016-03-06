import java.util.Scanner;

public class Rea
{
   
   public static void main(String[] args)
   {
      double pris, rea, rabatt, nyttPris;        // Deklarera variabler
      Scanner kb = new Scanner(System.in);        // Skapa objektet kb
      System.out.print("Skriv priset på varan: "); // Ge instruktion till användaren
      pris = kb.nextDouble();                    // Få input
      System.out.print("Skriv rea i procent: ");   // från 
      rea = kb.nextDouble();                       // användaren
      rabatt = pris * (rea / 100);                 // beräkna rabatten
      nyttPris = pris - rabatt;                    // beräkna nytt pris
      System.out.println("Om rabatten är: " + rabatt + "% blir det nya priset: " + nyttPris + " kr"); // skriv ut nytt pris
      
   }
}
