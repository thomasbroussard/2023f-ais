package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Customer;

public class Main {

    public static void main(String[] args){

        //create 3 customers with name and address (different from each other)
        // - quentin
        // - romain
        // - clément

        Customer customer1 = new Customer("Quentin", "Paris");
        Customer customer2 = new Customer("Romaina", "Paris");
        Customer customer3 = new Customer("Clément", "Paris");

        //fix the name for customer2
        customer2.setName("Romain");


    }
}
