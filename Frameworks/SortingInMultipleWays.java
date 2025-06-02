import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int rollN;
    String name;
    int age;
    Student(int rollN, String name, int age){
        this.age= age;
        this.rollN = rollN;
        this.name = name;
    }
    public String toString(){
        return age+" "+name+" "+rollN;
    }
}

class sortByName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class sortByRollN implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.rollN-s2.rollN;
    }
}

class sortByAge implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.age-s2.age;
    }
}

public class SortingInMultipleWays {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1027, "Akshu", 21));
        list.add(new Student(1004, "Ashu", 22));
        list.add(new Student(1026, "Billu", 20));
        list.add(new Student(1162, "Anshu", 21));
        list.add(new Student(1036, "Sam", 20));

        System.out.println("Sorted by Names -->");
        Collections.sort(list, new sortByName());
        for (Student student : list) {
            System.out.println(student.toString());
        }

        System.out.println("\nSorted by rollN -->");
        Collections.sort(list, new sortByRollN());
        for (Student student : list) {
            System.out.println(student.toString());
        }

        System.out.println("\nSorted by Age -->");
        Collections.sort(list, new sortByAge());
        for (Student student : list) {
            System.out.println(student.toString());
        }
    }
}
