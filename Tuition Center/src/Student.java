import java.util.Arrays;

public class Student {
    // attributes
    protected static Name name;
    private String IC, year, schoolName;
    protected Address address;
    private Score[] listScores = new Score[5];
    private double min, max, avg;

    // methods
    public Student() {
    }

    public Student(Name name, String IC, String year, Address address, String schoolName) {
        this.name = name;
        this.IC = IC;
        this.year = year;
        this.address = address;
        this.schoolName = schoolName;
    }

    public double findMinScore(){
        min=100.00;
        for (int i=0; i<listScores.length; i++) {
            if (listScores[i].getScore() <= min) {
                min = listScores[i].getScore();
            }
        }
        return min;
    }

    public double findMaxScore(){
        max=0.00;
        for (int i=0; i<listScores.length; i++) {
            if (listScores[i].getScore() >= max) {
                max = listScores[i].getScore();
            }
        }
        return max;
    }

    public double calcAvg(){
        double total= 0.0;

        for (int i=0; i<listScores.length; i++){
            total += listScores[i].getScore();
        }

        avg = total/listScores.length;

        return avg;
    }

    public void displayScores(){
        int sub=1;
        for (int i=0; i<listScores.length; i++){
            System.out.println("Marks #" + sub + ": " + String.format("%.2f", listScores[i].getScore()));
            sub++;
        }
        System.out.println("\n");
    }

    public String getName() {
        return name.getfName() + " " + name.getmName() + " " + name.getlName();
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Score[] getListScores() {
        return listScores;

    }

    public void setListScores() {
        for(int i=0; i<5; i++){
            Score studScore = new Score(Math.random()*100);
            listScores[i] = studScore;
        }
    }

    public void Analyze(){
        double min = findMinScore();
        double max = findMaxScore();
        double avg = calcAvg();
        System.out.println("Minimum Score: " + String.format("%.2f",min) + "\nMaximum score: " + String.format("%.2f",max)
                + "\nAverage: " + String.format("%.2f",avg));
    }

    public void displayStudentInfo(){
        System.out.println("Name: " + getName() + "\nIC Number: " + IC + "\nYear of Study: " + year +
                "\nSchool Name: " + schoolName + "\nAddress: " + Address.getAddress());
        Analyze();
    }
}
