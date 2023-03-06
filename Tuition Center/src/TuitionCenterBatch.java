/*
Pandai Sdn Bhd runs a number of tuition centers throughout KL and JB. Depending on business conditions, they are
looking continually to open new centers and from time to time, they may have to close existing ones.
Each tuition center, situated in a physical address and headed by a HeadMaster, employs a number of tutors to handle
batches of students (they take in a new batch each year).
Pandai Sdn Bhd from time to time needs a report on the performance of each center -
#students, #tutors, avg marks, min, max, tutors' background, etc.
*/
public class TuitionCenterBatch extends TuitionCenter {
    private int TuitionCenterCount=0;
    private TuitionCenter[] tuitions;

    public TuitionCenterBatch(TuitionCenter[] tuitions) {
        this.tuitions = tuitions;
    }

    public void AddCenter(TuitionCenter tuition){
        TuitionCenter newTuition = new TuitionCenter();
        TuitionCenterCount++;
    }
}
