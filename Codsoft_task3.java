package AtmInterface;
import java.util.*;
public class Codsoft_task3 {
    private double balance ;

    public Codsoft_task3(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double checkBalance() {
        return this.balance;
    }
}

class ATM {
    private Codsoft_task3 userAccount;

    public ATM(Codsoft_task3 userAccount) {
        this.userAccount = userAccount;
    }

    public String deposit(double amount) {
        if (this.userAccount.deposit(amount)) {
            return String.format("Successfully deposited $%.2f. New balance: $%.2f", amount, this.userAccount.checkBalance());
        } else {
            return "Invalid deposit amount.";
        }
    }

    public String withdraw(double amount) {
        if (this.userAccount.withdraw(amount)) {
            return String.format("Withdrew $%.2f. New balance: $%.2f", amount, this.userAccount.checkBalance());
        } else {
            return "Invalid withdrawal amount or insufficient funds.";
        }
    }

    public String checkBalance() {
        return String.format("Current balance: $%.2f", this.userAccount.checkBalance());
    }
}
public class Main {
    public static void main(String[] args) {
        Codsoft_task3 userBankAccount = new Codsoft_task3(1000);
        ATM atm = new ATM(userBankAccount);


        System.out.println(atm.checkBalance());
        System.out.println(atm.deposit(500));
        System.out.println(atm.checkBalance());
        System.out.println(atm.withdraw(200));
        System.out.println(atm.checkBalance());


    }

}

