import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        Scanner scanner = new Scanner(System.in);

// заполнить массив студентами в ручную
        /*while (Group.getIndex() < Group.getCountStudent()){
            System.out.println("Введите имя фамилию возраст факультет и курс студента:");
            String string = scanner.nextLine();
            String[] splitString = string.split(" ");
            String name = splitString[0];
            String surname = splitString[1];
            int age = Integer.parseInt(splitString[2]);
            String faculty = splitString[3];
            int course = Integer.parseInt(splitString[4]);

            try {
                group.addStudent(new Student(name, surname, age, faculty, course));
            } catch (countStudentException e) {
                System.out.println(e.getMessage());
            }
        }*/
// заполнить массив студентами
        try {
            group.addStudent(new Student("Alex0", "Platon", 15, "IT", 4));
            group.addStudent(new Student("Alex1", "Platon1", 24, "IT", 3));
            group.addStudent(new Student("Alex9", "Platon9", 30, "Engineer", 2));
            group.addStudent(new Student("Alex2", "Platon2", 32, "IT", 2));
            group.addStudent(new Student("Alex4", "Platon4", 18, "Maneger", 2));
            group.addStudent(new Student("Alex8", "Platon8", 17, "Engineer", 4));
            group.addStudent(new Student("Alex5", "Platon5", 15, "Maneger", 2));
            group.addStudent(new Student("Alex6", "Platon6", 12, "IT", 1));
            group.addStudent(new Student("Alex7", "Platon7", 28, "IT", 2));
            group.addStudent(new Student("Alex3", "Platon3", 43, "Maneger", 3));
        } catch (countStudentException e) {
            System.out.println(e.getMessage());
        }
//удаление
        group.delStudent(2);


//сортировка по параметру
        System.out.println("По какому параметру сортировать?");
        System.out.println("0 - Имя\n1 - Фамилия\n2 - возраст\n3 - факультет\n4 - курс");
        int parametr = scanner.nextInt();
        group.sortByParametr(parametr);
        System.out.println(group);

//интерфейс военком
        Student[] soldiers = group.getSoldier();
        for (Student sl : soldiers){
            System.out.println(sl);
        }

    }
}































/*System.out.println("Введите Имя Фамилию возраст факультет и курс студента через пробел:");
            Scanner scn = new Scanner(System.in);
            String data = scn.nextLine();
            String[] splitData = data.split(" ");
            String name = splitData[0];
            String surname = splitData[1];
            int age = Integer.parseInt(splitData[2]);
            String faculty = splitData[3];
            int course = Integer.parseInt(splitData[4]);
            try {
                group.addStudent(new Student(name,surname,age,faculty,course));
            } catch (countStudentException e) {
                e.printStackTrace();
            }*/