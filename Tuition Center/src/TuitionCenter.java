/*
Pandai Sdn Bhd runs a number of tuition centers throughout KL and JB. Depending on business conditions, they are
looking continually to open new centers and from time to time, they may have to close existing ones.
Each tuition center, situated in a physical address and headed by a HeadMaster, employs a number of tutors to handle
batches of students (they take in a new batch each year).
Pandai Sdn Bhd from time to time needs a report on the performance of each center -
#students, #tutors, avg marks, min, max, tutors' background, etc.
*/

public class TuitionCenter {
    private String centerName;
    private Address address;
    private Name headMaster;
    private TutorBatch tutorCount, tutorBg;
    private StudentBatch studentCount, avgMarks, minMarks, maxMarks;

    public TuitionCenter() {
    }

    public TuitionCenter(String centerName) {
        this.centerName = centerName;
    }

    public void DisplayCenter(){
        System.out.println("Center Name: " + centerName + "\nAddress: " + Address.getAddress() + "\nHeadmaster: "+
                headMaster + "\nNumber of Tutors: " + TutorBatch.getTutCount() + "\nNumber of Students: " +
                studentCount.getStudCount() + "\nMinimum Mark: " + String.format("%.2f", minMarks.getMinScore()) +
                "\nMaximum mark: " + String.format("%.2f", maxMarks.getMaxScore()) +
                "\nAverage marks: " + String.format("%.2f", avgMarks.getAvg()));
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Name getHeadMaster() {
        return headMaster;
    }

    public void setHeadMaster(Name headMaster) {
        this.headMaster = headMaster;
    }

    public TutorBatch getTutorCount() {
        return tutorCount;
    }

    public void setTutorCount(TutorBatch tutorCount) {
        this.tutorCount = tutorCount;
    }

    public TutorBatch getTutorBg() {
        return tutorBg;
    }

    public void setTutorBg(TutorBatch tutorBg) {
        this.tutorBg = tutorBg;
    }

    public StudentBatch getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(StudentBatch studentCount) {
        this.studentCount = studentCount;
    }

    public StudentBatch getAvgMarks() {
        return avgMarks;
    }

    public void setAvgMarks(StudentBatch avgMarks) {
        this.avgMarks = avgMarks;
    }

    public StudentBatch getMinMarks() {
        return minMarks;
    }

    public void setMinMarks(StudentBatch minMarks) {
        this.minMarks = minMarks;
    }

    public StudentBatch getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(StudentBatch maxMarks) {
        this.maxMarks = maxMarks;
    }
}
