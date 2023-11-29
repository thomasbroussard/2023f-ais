package fr.epita.bank.services;

import fr.epita.bank.datamodel.InvestmentAccount;
import fr.epita.bank.datamodel.Stock;
import fr.epita.bank.datamodel.StockOrder;

public class TransactionService {

    public static void buyStock(Stock stock, InvestmentAccount investmentAccount, double commissionRate, int quantity) {
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
