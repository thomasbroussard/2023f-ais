package fr.epita.hdi.datamodel;

public class HDIEntry {
    private Integer rank;
    private String country;
    private double hdi;

    public HDIEntry(Integer rank, String country, double hdi) {
        this.rank = rank;
        this.country = country;
        this.hdi = hdi;
    }
}
