package vecka_6;

import java.util.Random;

public class Spelare {
    private String namn; // instansvariabler
    private int poäng, kast, vinster, forluster;

    /*konstrueraren */
    public Spelare(String nm) {
        this.namn = nm;
        this.poäng = 0;
        this.kast = 3;
        this.vinster = 0;
        this.forluster = 0;
    }

    /* returnerar namn */
    public String getNamn() {
        return namn;
    }

    /* metoden ska simulera tärningskastet genom att slumpa n (max 3) st
    värden mellan 1 och 6. Summan av alla dessa värden skall tilldelas till
    klassen variabel poäng*. Om n är noll inga träningar skall kastas, om
    n är 1 en tärning mm..*/

    public void spela(int n) {
        //if (kast != 0) {
            kast -= 1;
            Random randNr = new Random();
            for (int i = 0; i < n; i++) {
                poäng += randNr.nextInt(6) + 1;
            }
        //} else {
        //    System.out.println("Du har redan kastat 3 gånger!");
        //}
    }

    /* metoden skall returnera antalet poäng */
    public int getPoäng() {
        return poäng;
    }

    public int getKast() {
        return kast;
    }

    /* metoden sätter variabel poäng till noll */
    public void nollStall() {
        poäng = 0;
        kast = 3;
    }
}
