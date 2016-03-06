package bibliotek;


public class EmailCheckMain {

    public static void main(String[] args) {
        String[] mail = new String[3];

        mail[0] = "matpet15@halmstad.se";
        mail[1] = "abc.@test.com";
        mail[2] = "abc@test..com";

        for (String i : mail) {
            System.out.println(i + " : " + EmailCheck.isEmail(i));

        }
    }
}
