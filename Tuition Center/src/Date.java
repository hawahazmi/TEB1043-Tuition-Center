import java.util.Scanner;

public class Date {
    // attributes
    private static String day;
    private static String month;
    private static String year;
    private static String fullDate;

    // methods
    public Date() {
    }

    public Date(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setDate(){
        Scanner inputUser = new Scanner(System.in);
        fullDate = inputUser.nextLine();
    }

    public static String getDate(){
        try{
            return day + " " + month + " " + year;

        } catch(Exception x){
            return fullDate;
        }
    }
}
