import java.util.Scanner;
public class TutorBatch extends Tutor {
    // attributes
    private static int tutCount=0;
    private Tutor[] tutors = new Tutor[tutCount];

    // methods
    public TutorBatch() {
    }

    public void AddTutor(Tutor tutor){
        tutCount++;
    }

    public static int getTutCount() {
        return tutCount;
    }

    boolean find(String fname) {
        for (int i=0; i<tutCount; i++) {
            String find = tutors[i].name.getfName();
            if (find == fname)
                return true;
        }
        return false;
    }
}
