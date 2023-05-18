package main.com.jc.assignment.JCA1;


//address1, address2, address3, state, city, zip
public class Address {

    private String address1;

    private String address2;

    private String address3;

    private String state;

    private String city;

    private int zip;


    public Address(String address1, String address2, String address3, String state, String city, int zip){
        this.address1=address1;
        this.address2=address2;
        this.address3=address3;
        this.state=state;
        this.city=city;
        this.zip=zip;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
