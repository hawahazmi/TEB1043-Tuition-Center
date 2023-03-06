public class Tutor {
    // attributes
    protected Name name;
    private String IC, qualification;
    protected Address address;
    protected Date dateJoined;
    private int numYearExp, numYearInCenter;

    // methods

    public Tutor() {
    }

    public Tutor(Name name, String IC, String qualification, Address address, Date dateJoined, int numYearExp, int numYearInCenter) {
        this.name = name;
        this.IC = IC;
        this.qualification = qualification;
        this.address = address;
        this.dateJoined = dateJoined;
        this.numYearExp = numYearExp;
        this.numYearInCenter = numYearInCenter;
    }

    public void DisplayTutor(){
        System.out.println("Name: " + Name.getName() + "\nIC Number: " + IC + "\nQualification: " + qualification +
                "\nAddress: " + Address.getAddress() + "\nDate Joined: " + Date.getDate() + "\nYears of Experience: " +
                numYearExp + "\nYears in Center: " + numYearInCenter);
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public int getNumYearExp() {
        return numYearExp;
    }

    public void setNumYearExp(int numYearExp) {
        this.numYearExp = numYearExp;
    }

    public int getNumYearInCenter() {
        return numYearInCenter;
    }

    public void setNumYearInCenter(int numYearInCenter) {
        this.numYearInCenter = numYearInCenter;
    }
}
