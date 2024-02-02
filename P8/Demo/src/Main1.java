import java.util.*;
// luu ten cac ban trong lop = set
// array luu ten cac ban trong lop
class Student implements Comparable<Student>{




    public String name;
    Student(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return -this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Student obj) {
        return this.name.equals(obj.name);
    }
}
public class Main1 {
    public static void main(String[] args) {
        Set<Student> list = new LinkedHashSet<>();
        list.add(new Student("Tiến"));
        list.add(new Student("Chính"));
        list.add(new Student("Taan"));
        list.add(new Student("Tiến"));
//        Collections.sort(list);
        for(Student x : list){
            System.out.println(x.name);
        }

    }
}
