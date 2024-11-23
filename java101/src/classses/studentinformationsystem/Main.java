package classses.studentinformationsystem;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Onur", "0905000000000", "MAT");
        Teacher teacher2 = new Teacher("Yetkin", "0905000000001", "PHY");
        Teacher teacher3 = new Teacher("Alperen", "0905000000002", "CHE");
        Teacher teacher4 = new Teacher("Berker", "0905000000003", "MSC");
        Teacher teacher5 = new Teacher("Atacan", "0905000000004", "HST");

        Course mathematics = new Course("Mathematics", "MAT101", "MAT");
        Course physics = new Course("Physics", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHE101", "CHE");
        Course music = new Course("Music", "MSC101", "MSC");
        Course history = new Course("History", "HST101", "HST");

        Student student1 = new Student("Özcan", "1", 4, mathematics, physics, chemistry, music, history);
        Student student2 = new Student("Efe", "2", 4, mathematics, physics, chemistry, music, history);
        Student student3 = new Student("Doğa", "3", 4, mathematics, physics, chemistry, music, history);
        Student student4 = new Student("Emre", "4", 4, mathematics, physics, chemistry, music, history);
        Student student5 = new Student("Oğuz", "4", 4, mathematics, physics, chemistry, music, history);

        System.out.println("--------------------------------------------------------------------");

        mathematics.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        chemistry.addTeacher(teacher3);
        music.addTeacher(teacher4);
        history.addTeacher(teacher5);

        System.out.println("--------------------------------------------------------------------");

        mathematics.printTeacher();
        physics.printTeacher();
        chemistry.printTeacher();
        music.printTeacher();
        history.printTeacher();

        System.out.println("--------------------------------------------------------------------");

        student1.addBulkExamNote(35, 100, 90, 100, 90);
        student2.addBulkExamNote(96, 40, 10, 100, 53);
        student3.addBulkExamNote(64, 31, 90, 100, 41);
        student4.addBulkExamNote(15, 90, 66, 100, 95);
        student5.addBulkExamNote(85, 92, 100, 100, 100);

        student1.addVerbalNote(85, 92, 100, 100, 100);
        student2.addVerbalNote(35, 100, 90, 100, 90);
        student3.addVerbalNote(96, 40, 10, 100, 53);
        student4.addVerbalNote(64, 31, 90, 100, 41);
        student5.addVerbalNote(15, 90, 66, 100, 95);

        student1.printNote();
        student2.printNote();
        student3.printNote();
        student4.printNote();
        student5.printNote();

        System.out.println("--------------------------------------------------------------------");

        student1.isPassed();
        student2.isPassed();
        student3.isPassed();
        student4.isPassed();
        student5.isPassed();

    }
}