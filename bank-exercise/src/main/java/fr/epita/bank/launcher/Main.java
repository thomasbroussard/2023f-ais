package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Customer;

public class Main {

    public static void main(String[] args){

        //create 3 customers with name and address (different from each other)
        // - quentin
        // - romain
        // - clément

        Customer customer = new Customer("quentin", "Paris");
        customer.setName("");

    }
}
