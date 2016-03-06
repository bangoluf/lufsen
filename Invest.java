public class Invest {

    public static void main(String[] arg) {
        double pengar;
        int ranta, nrAr;

        pengar = 1000;
        ranta = 5;
        nrAr = 10;

        double ranta2 = 1 + ranta / 100.0;
        double intjanat = pengar * Math.pow(ranta2, nrAr);

        System.out.println(intjanat);
    }
}
