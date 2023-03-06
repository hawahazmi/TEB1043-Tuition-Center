import java.util.Scanner;

public class Name {
    private static String fName;
    private static String mName;
    private static String lName;
    private static String name;

    public Name() {
    }

    public Name(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    public Name(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setName(String fName, String mName, String lName){
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    public void setName(){
        Scanner inputUser = new Scanner(System.in);
        name = inputUser.nextLine();
    }

    public static String getName(){
        try{
            return fName + " " + mName + " " + lName;

        } catch(Exception x){
            return name;
        }
    }

}
