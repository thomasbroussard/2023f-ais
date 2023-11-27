package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.Customer;
import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.Stock;
import fr.epita.bank.datamodel.StockOrder;

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

        Stock stock1 = new Stock("GOLD", 500.0);
        Stock stock2 = new Stock("AMZ", 50.0);
        Stock stock3 = new Stock("TESLA", 540.0);


        //create a stock order to buy 5 actions of TESLA, the commission rate is 3,0%
        InvestmentAccount investmentAccount = new InvestmentAccount(10000);
        double commissionRate = 0.03;
        int quantity = 5;


        buyStock(stock3, investmentAccount, commissionRate, quantity);

        System.out.println(investmentAccount.getBalance());

    }

    private static void buyStock(Stock stock, InvestmentAccount investmentAccount, double commissionRate, int quantity) {
        StockOrder order = new StockOrder();
        order.setInvestmentAccount(investmentAccount);
        order.setPrice(stock.getCurrentPrice());
        order.setCommission(commissionRate);
        order.setQuantity(quantity);
        order.setStock(stock);
        double totalPrice = (1 + order.getCommission()) * order.getPrice() * order.getQuantity();
        investmentAccount.setBalance(investmentAccount.getBalance() - totalPrice);
    }
}
