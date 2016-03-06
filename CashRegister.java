import java.util.Scanner;

public class CashRegister {
 
   public static void main(String[] arg) {
		  Scanner input = new Scanner(System.in);
		  double attBetala;
		  double betalat;
		  
		   // läs in summa att betala och hur mycket man betalade
		  System.out.println("Att betala: ");
        attBetala = input.nextDouble();		  
		  System.out.println("Betalat: ");
        betalat = input.nextDouble();
        
        double tillbaka = betalat - attBetala;
        
        // beräkna växel att få tillbaka

		  int hundralappar = (int)tillbaka / 100;		  	
		  double rest = tillbaka % 100;		  
		  
        int femtiolappar = (int)rest / 50;
        rest = rest % 50;
    
        int tjugolappar = (int) rest / 20;
        rest = rest % 20;
     
        int tiokronor = (int) rest / 10;
        rest= rest % 10;
            
        int femkronor = (int) rest / 5;
        rest= rest % 5;
     
        int enkronor = (int)rest;
        rest = rest - enkronor;
         
        System.out.println("--------------------");
        System.out.println(" ");
        System.out.println("Växel: ");
        if (hundralappar > 0) {
            System.out.print(hundralappar + " st hundralappar, ");
        }
       
        if (femtiolappar > 0) {
            System.out.print(femtiolappar + " st femtiolappar, ");
        }
       
        if (tjugolappar > 0) {
             System.out.print(tjugolappar + " st tjugolappar, ");
        }
            
        if (tiokronor > 0) {
            System.out.print(tiokronor + " st tiokronor, ");
        } 
           
        if (femkronor > 0) {
            System.out.print(femkronor + " st femkronor, ");
        } 
           
        if (enkronor > 0) {
            System.out.print(enkronor + " st enkronor.");
        }
            
        System.out.println(" \n");
        System.out.println("--------------------");
    
    }
}
