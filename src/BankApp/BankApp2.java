package BankApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BankApp2 { //Class start
    public static void main(String[] args){ //main start
        int a = 5;
        account a1=new account("Joe Pass", 5);
        account a2=new account("Jimmy Hendrix", 7);
        account a3=new account("Peter Pedal",2.5);


        a1.deposit(200);
        a1.withdraw(100);

        a2.deposit(200);
        a2.withdraw(100);

        a3. deposit(20000);
        a3.withdraw(17000);

        a1.anualInterest();
        a2.anualInterest();
        a3.anualInterest();

        a1.printTransactions();
        a2.printTransactions();
        a3.printTransactions();

    } //main slut
}//class slut




// her laves en ny class som er uafhængig af den anden class.
class account { // aacount class start
    static int noOfAccounts=0;
    protected int accountNO; // konto nr
    protected String owner; // ejer
    protected double balance; // penge i banken
    protected double interestRate; // rente
    protected ArrayList<transaction> transactions = new ArrayList<transaction>();

    account(String ow, double ir) { // Constructor start
        noOfAccounts++;
        accountNO =noOfAccounts;
        owner = ow;
        interestRate = ir;
        balance = 0;
    }//Construtor slut

    Void setOwner(String newName) {
        owner = newName;
        return null;
    }

    void deposit(double amount) {
        balance = balance + amount;
        transactions.add(new transaction("indsat", amount, balance));
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance = balance - amount;
        transactions.add(new transaction("Hævet", amount, balance));
    }
void anualInterest(){
        double amount=balance*interestRate/100;
        balance=balance+amount;
    transactions.add(new transaction("Renter", amount, balance));
}
    void printTransactions() {
        System.out.println(this);
        System.out.println("text\tdato\t\tbelob\tsaldo");
        for (transaction t : transactions) {
            System.out.println(t);
        }
    }
        public String toString () {//to string start
            return "Kontonr: " + accountNO + "\t" + owner + "\t" + balance;
        } //to string slut
    } //account class slut


    class transaction { //transactions class start
        String text;
        LocalDate date;
        double ammount;
        double newBallance;

        transaction(String text, double ammount, double newBallance) {
            this.text = text;
            this.ammount = ammount;
            this.newBallance = newBallance;
            date = LocalDate.now();
        }

        public String toString() {
            return text + "\t" + date + "\t" + ammount + "\t" + newBallance;
        }
    }//transaction class end
