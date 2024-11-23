package classses.studentinformationsystem;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    Teacher courseTeacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("Successfully Added To The Course " + this.name + " By " + teacher.name);
        } else {
            System.out.println(teacher.name + " Cannot Teach This Course.");
        }

    }

    void printTeacher() {
        if (this.courseTeacher != null) {
            System.out.println("Instructor For The Course " + this.name + " : " + this.courseTeacher.name);
        } else {
            System.out.println("No Instructor Assigned To The Course " + this.name + ".");
        }

    }

}