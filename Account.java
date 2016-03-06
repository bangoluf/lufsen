//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************

package vecka_6;


public class Account {

    private double balance;
    private String name;
    private long number;

    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String initName, long initNumber) {
        balance = initBal;
        name = initName;
        number = initNumber;
    }

    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount) {
        balance += amount;
    }

    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance() {
        return balance;
    }

    //----------------------------------------------
    // Returns the account number.
    //----------------------------------------------
    public double getNumber() {
        return number;
    }

    //----------------------------------------------
    // Deducts $10 service fee
    //----------------------------------------------
    public double chargeFee() {
        balance -= 10;
        return balance;
    }

    //----------------------------------------------
    // Changes the name on the account
    //----------------------------------------------
    public void changeName(String newName) {
        name = newName;
    }

    //----------------------------------------------
    // Build and returns a string containing the
    // name, account number, and balance.
    //----------------------------------------------
    public String toString() {
        return("Name: " + name
                + "\nAccount number: " + number
                + "\nBalance: " + balance);
    }

}
