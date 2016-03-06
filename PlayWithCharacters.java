public class PlayWithCharacters {
    public static void main (String[] arg) {
        String ord = "hej";
        String krypteradText = "";

        for (int i = 0; i < ord.length(); i++) {
            char bokstav = (char) (ord.charAt(i) + 1);
            krypteradText = krypteradText + bokstav;
        }
        System.out.println(krypteradText);
    }
}
