import java.util.Scanner;

public class Address {
    // attributes
    private static String unitno;
    private static String street;
    private static String postcode;
    private static String district;
    private static String state;
    private static String fullAddr;

    // methods

    public Address() {
    }

    public Address(String unitno, String street, String postcode, String district, String state) {
        this.unitno = unitno;
        this.street = street;
        this.postcode = postcode;
        this.district = district;
        this.state = state;
    }

    public String getUnitno() {
        return unitno;
    }

    public void setUnitno(String unitno) {
        this.unitno = unitno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setAddress(){
        Scanner inputUser = new Scanner(System.in);
        fullAddr = inputUser.nextLine();
    }

    public static String getAddress(){
        try{
            return unitno + " " + street + " " + postcode + " " + district + " " + state;

        } catch(Exception x){
            return fullAddr;
        }
    }
}
