package fr.epita.bank.datamodel;

public class Customer {
    private String name;
    private String address;

    public Customer(String newname, String newaddress){
        this.name = newname;
        this.address = newaddress;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()){
            return;
        }
        this.name = name;
    }
}
