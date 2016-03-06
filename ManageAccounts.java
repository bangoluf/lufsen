package vecka_6;


public class ManageAccounts {
    public static void main(String[] args) {
        Account konto1, konto2;

        //skapa Account-objekt för Sally
        konto1 = new Account(1000, "Sally", 1111);

        //Skapa Account object för Sam med $500
        konto2 = new Account(500, "Sam", 2222);

        // Gör “deposit” med $100 på Sam’s konto
        konto2.deposit(100);

        //Skriv ut Sam’s konto (med toString())
        System.out.println(konto2.toString());

        // gör “withdraw” med $50 på Sally's konto
        konto1.withdraw(50);

        //Skriv ut Sally's balance (use getBalance())
        System.out.println(konto1.getBalance());

        //Skriv ut Sally’s konto ( med toString())
        System.out.println(konto1.toString());

        konto1.changeName("Sallytest");
        System.out.println(konto1.toString());
        System.out.println(konto1.getBalance());

        konto2.withdraw(1000);
    }
}