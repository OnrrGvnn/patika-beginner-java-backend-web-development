package classses.studentinformationsystem;

public class Student {
    String name;
    String studentID;
    int classID;
    double averageGrade;
    boolean isPassed;
    Course course1;
    Course course2;
    Course course3;
    Course course4;
    Course course5;

    Student(String name, String studentID, int classID, Course mathematics, Course physics, Course chemistry, Course music, Course history) {
        this.name = name;
        this.studentID = studentID;
        this.classID = classID;
        this.averageGrade = 0.0;
        this.isPassed = false;
        this.course1 = mathematics;
        this.course2 = physics;
        this.course3 = chemistry;
        this.course4 = music;
        this.course5 = history;
    }

    void addBulkExamNote(int mathematics, int physics, int chemistry, int music, int history) {
        if (mathematics >= 0 && mathematics <= 100) {
            this.course1.note = mathematics;
        }

        if (physics >= 0 && physics <= 100) {
            this.course2.note = physics;
        }

        if (chemistry >= 0 && chemistry <= 100) {
            this.course3.note = chemistry;
        }

        if (music >= 0 && music <= 100) {
            this.course4.note = music;
        }

        if (history >= 0 && history <= 100) {
            this.course5.note = history;
        }

    }

    void addVerbalNote(int mathematicsVerbalNote, int physicsVerbalNote, int chemistryVerbalNote, int musicVerbalNote, int historyVerbalNote) {
        if (mathematicsVerbalNote >= 0 && mathematicsVerbalNote <= 100) {
            this.course1.verbalNote = mathematicsVerbalNote;
        }

        if (physicsVerbalNote >= 0 && physicsVerbalNote <= 100) {
            this.course2.verbalNote = physicsVerbalNote;
        }

        if (chemistryVerbalNote >= 0 && chemistryVerbalNote <= 100) {
            this.course3.verbalNote = chemistryVerbalNote;
        }

        if (musicVerbalNote >= 0 && musicVerbalNote <= 100) {
            this.course4.verbalNote = musicVerbalNote;
        }

        if (historyVerbalNote >= 0 && historyVerbalNote <= 100) {
            this.course5.verbalNote = historyVerbalNote;
        }

    }

    void printNote() {
        System.out.println("\nStudent: " + this.name);
        System.out.println("Math Grade : " + this.course1.note + " && Math Verbal Grade : " + this.course1.verbalNote);
        System.out.println("Physics Grade: " + this.course2.note + " && Physics Verbal Grade : " + this.course2.verbalNote);
        System.out.println("Chemistry Grade: " + this.course3.note + " && Chemistry Verbal Grade : " + this.course3.verbalNote);
        System.out.println("Music Grade: " + this.course4.note + " && Music Verbal Grade : " + this.course4.verbalNote);
        System.out.println("History Grade: " + this.course5.note + " && History Verbal Grade : " + this.course5.verbalNote);

    }

    void calculateAverageGrade() {
        double mathematicsNote = (this.course1.note * 0.80) + (this.course1.verbalNote * 0.20);
        double physicsNote = (this.course2.note * 0.80) + (this.course2.verbalNote * 0.20);
        double chemistryNote = (this.course3.note * 0.80) + (this.course3.verbalNote * 0.20);
        double musicNote = (this.course4.note * 0.80) + (this.course5.verbalNote * 0.20);
        double historyNote = (this.course5.note * 0.80) + (this.course4.verbalNote * 0.20);

        this.averageGrade = (mathematicsNote + physicsNote + chemistryNote + musicNote + historyNote) / 5;

    }

    void isPassed() {
        if (this.course1.note == 0 || this.course2.note == 0 || this.course3.note == 0 || this.course4.note == 0 || this.course5.note == 0) {
            System.out.println("The Notes Were Not Entered Correctly! ");
        } else {
            calculateAverageGrade();

            if (this.averageGrade >= 55) {
                System.out.println(this.name + " Passed The Class. Your Average : " + this.averageGrade);
                isPassed = true;
            } else {
                System.out.println(this.name + " Failed The Class. Your Average : " + this.averageGrade);
                isPassed = false;
            }

        }

    }

}