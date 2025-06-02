import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Student implements Comparable <Student>{
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    void display(){
        System.out.println(age+", "+name);
    }
    public int compareTo(Student s){
        return this.age-s.age;
    }
}

public class ListsUsingClasses {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(20,"Akshu"));
        list.add(new Student(20, "Anshu"));
        list.add(new Student(19, "Biluu"));
        list.add(new Student(19, "Sam"));
        list.add(new Student(23, "Ashu baba"));
        Collections.sort(list);
        for (Student student : list) {
            student.display();
        }
    }
}
