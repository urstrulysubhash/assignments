package main.com.jc.assignment.JCA1;

//name, ein, noOfEmployess, Address, ticker
public class Company extends Address {
    private String name;
    private String ein;
    private int noOfEmployees;
    private String ticker;

    public Company(String name, String ein, int noOfEmployees,String address1, String address2, String address3, String state, String city, int zip,  String ticker){
        super(address1, address2, address3, state, city, zip);
        this.ein=ein;
        this.name=name;
        this.noOfEmployees=noOfEmployees;
        this.ticker=ticker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
}
