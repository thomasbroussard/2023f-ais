package fr.epita.bank.datamodel;

public class SavingsAccount extends Account {
    double interestRate;


    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
}
