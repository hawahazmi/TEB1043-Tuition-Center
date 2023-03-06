import java.util.Arrays;
import java.util.Scanner;

public class StudentBatch extends Student {
    // attributes
    private static int studCount=5;
    private Student students[] = new Student[studCount];
    private double avg, min, max;

    // methods

    public StudentBatch(){
    }

    public void AddStudent(Student stud){
        studCount++;
    }

    public void displayAllStudent(){
        int i=1;
        while(i<students.length){
            System.out.println("STUDENT #" + i);
            students[i].displayStudentInfo();
            i++;
        }
    }

    boolean find(String fname) {
        for (int i=0; i<studCount; i++) {
            String find = students[i].name.getfName();
            if (find == fname)
                return true;
        }
        return false;
    }

    public double getMinScore(){
        min=100.00;
        for (int i=0; i<students.length; i++) {
            double minScore = students[i].findMinScore();
            if (minScore <= min) {
                min = minScore;
            }
        }
        return min;
    }

    public double getMaxScore(){
        max=0.00;
        for (int i=0; i<students.length; i++) {
            double maxScore = students[i].findMaxScore();
            if (maxScore >= max) {
                max = maxScore;
            }
        }
        return max;
    }

    public double getAvg(){
        double total= 0.0;

        for (int i=0; i<students.length; i++){
            total += students[i].calcAvg();
        }

        avg = total/students.length;

        return avg;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getStudCount() {
        return studCount;
    }

    @Override
    public String toString() {
        return "StudentBatch{" +
                "students=" + Arrays.toString(students) +
                ", avg=" + avg +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
