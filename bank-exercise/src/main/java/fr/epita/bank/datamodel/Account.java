package fr.epita.bank.datamodel;


public class Account {
    double balance;

    public Account(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
