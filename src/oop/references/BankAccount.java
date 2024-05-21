package oop.references;

public class BankAccount {
    long bankID;
    double balance;
    Person owner;

    public BankAccount(long bankID, double balance, Person owner) {
        this.bankID = bankID;
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if (this.balance >= amount){
            balance -= amount;
            return true;
        }  else {

            System.out.println("Osoba " + owner.fullName + " nemuze vybrat tolik penez z uctu");
            return false;
        }
    }

    public boolean transaction(double amount, BankAccount other){
        if (withdraw(amount)){
            other.deposit(amount);
            other.deposit(amount);

            return true;
        } else {
            System.out.println("Nelze prevest");
            return false;
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Frantisek", "Plzen");
        Person p2 = new Person("Karel", "Praha");

        BankAccount account1 = new BankAccount(27857, 50000, p1);
        BankAccount account2 = new BankAccount(1234, 10000, p2);

        account2.withdraw(5000);

        if (account2.transaction(1000, account1)){
            System.out.println("Uzivatel " + account2.owner.fullName + " poslal uzivateli " + account1.owner.fullName + " penize na ucet");
        }

    }
}
