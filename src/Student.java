import java.util.Comparator;

public class Student extends Human {

    private String faculty;
    private int course;


    public Student(String name, String surname, int age, String faculty, int course) {
        super(name, surname, age);
        this.faculty = faculty;
        this.course = course;
    }

    public Student(){

    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return super.toString() + ",\tFaculty: " + faculty + ",\tCourse: " + course;
    }
}