package fr.epita.bank.datamodel;

public class StockOrder {
     double price;
     double commission;
     int quantity;

     Stock stock;

     InvestmentAccount investmentAccount;


     public void setStock(Stock stock) {
          this.stock = stock;
     }

     public double getPrice() {
          return price;
     }

     public void setPrice(double price) {
          this.price = price;
     }

     public double getCommission() {
          return commission;
     }

     public void setCommission(double commission) {
          this.commission = commission;
     }

     public int getQuantity() {
          return quantity;
     }

     public void setQuantity(int quantity) {
          this.quantity = quantity;
     }

     public Stock getStock() {
          return stock;
     }

     public InvestmentAccount getInvestmentAccount() {
          return investmentAccount;
     }

     public void setInvestmentAccount(InvestmentAccount investmentAccount) {
          this.investmentAccount = investmentAccount;
     }
}
