import java.util.Scanner;

    /*
    Indata: vikt, längd, kön, ålder

    fråga efter vikt, längd, kön och ålder
    beräkna bmi

    if man
        faktor = 16.2
    else
        faktor = 5.4

    beräkna kroppsfett

    if man && kroppsfett > 20
        rekommendera mycket motion
    if-else kvinna && kroppsfett > 30
        rekommendera mycket motion
    else
    rekommendera normal motion

    Utdata: Rekommenderad motion beroende på fettprocent
    */

public class RecommendExercise {

    public static void main(String[] arg) {
        double vikt, langd, bmi, fettprocent;
        int kon, alder;
        String konInput;

        Scanner kb = new Scanner(System.in);

        System.out.print("Skriv din vikt i kg: ");
        vikt = kb.nextDouble();

        System.out.print("Skriv din längd i cm: ");
        langd = kb.nextDouble();

        System.out.print("Skriv din ålder: ");
        alder = kb.nextInt();
        kb.nextLine();

        System.out.print("Man eller Kvinna?: ");
        konInput = kb.nextLine();

        if (konInput.equalsIgnoreCase("man")) {
            kon = 1;
        } else {
            kon = 2;
        }

        bmi = CalculateBmi.CalcBmi(vikt, langd);
        fettprocent = CalculateFat.calcFat(bmi, kon, alder);

        if (kon == 1 && fettprocent > 20) {
            System.out.println("Din fettprocent är över 30%! Du borde motionera mer!");
        } else if (kon == 2 && fettprocent > 30) {
                System.out.println("Din fettprocent är över 30%! Du borde motionera mer!");
        } else {
            System.out.println("Din fettprocent är inom normalvärdena! Du behöver inte öka din motion.");

        }


    }

}
