import java.util.Arrays;

public class Group implements Voenkom{
    private static int countStudent = 10;
    private Student[] students = new Student[countStudent];
    private static int index;

    public static int getCountStudent() {
        return countStudent;
    }

    public static int getIndex() {
        return index;
    }

    public void addStudent(Student student) throws countStudentException{
        if(index >= countStudent){
            throw new countStudentException();
        }
        if(student != null){
            students[index++] = student;
        }
    }

    public void delStudent(int index){
        if(index >= 0 && index < countStudent){
            students[index] = null;
        }
    }

    public void sortByParametr(int i){
        Arrays.sort(students, new StudentComparator(i));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            if (student != null) {
                sb.append(student);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override
    public Student[] getSoldier() {
        int count = 0;
        for(Student st : students){
            if(st != null && st.getAge() >= 18){
                count++;
            }
        }

        Student[] soldiers = new Student[count];
        int i = 0;
        for(Student st : students){
            if(st != null && st.getAge() >= 18){
                soldiers[i++] = st;
            }
        }
        return soldiers;
    }
}

