/*
Pandai Sdn Bhd runs a number of tuition centers throughout KL and JB. Depending on business conditions, they are
looking continually to open new centers and from time to time, they may have to close existing ones.
Each tuition center, situated in a physical address and headed by a HeadMaster, employs a number of tutors to handle
batches of students (they take in a new batch each year). Tutors are all freelancers; they come and go throughout
the year, and each student is assigned to one tutor. Each center maintains the data for each tutor (name, IC,  address,
qualification, # yearexp, date joined, # years in the center etc) and each student (name, IC, address, year, school
name, list of scores, etc). Pandai Sdn Bhd from time to time needs a report on the performance of each center -
#students, #tutors, avg marks, min, max, tutors' background, etc.

Classes: TuitionCenter, Tutor, TutorBatch, Student, StudentBatch
Output: Report on performance of each center
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------- PANDAI SDN BHD --------------------\n");

        TuitionCenter PandaiKL = new TuitionCenter("Pandai Kuala Lumpur");
        PandaiKL.setAddress(new Address("No 1", "Jalan Setia", "16100", "Bandar Baru",
                "Kuala Lumpur"));
        PandaiKL.setHeadMaster(new Name("Nur Naim", "bin", "Firdaus Ismet"));

        Student Fakhri = new Student(new Name("Nur Fakhri", "bin", "Firdaus Ismet"),
                "030116030760", "Form 4", new Address("No 3", "Jalan Kudrat", "53000",
                "Bandar Setia", "Kuala Lumpur"), "Kolej Ungku Deramat");
        Fakhri.setListScores();
        Fakhri.displayStudentInfo();
        Fakhri.displayScores();


        Tutor Ain = new Tutor(new Name("Nurul Ain", "binti", "Iman"), "900212056001",
                "Degree in Education",
                new Address("No 7", "Jalan Setia", "16900", "Bandar Jaya", "Kuala Lumpur"),
                new Date("12", "January", "2021"), 5, 2);
        Ain.DisplayTutor();

        StudentBatch PandaiKL23 = new StudentBatch();
        PandaiKL23.AddStudent(Fakhri);


        }
}