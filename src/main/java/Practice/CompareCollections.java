package Practice;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


public class CompareCollections {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Dany");
        Student s2 = new Student(3, "Jon");
        Student s3 = new Student(1, "Cersei");
        List<Student> students = Arrays.asList(new Student[]{s1, s2, s3});
        System.out.println(students);

        Comparator<Student> byId = Comparator.comparing(Student::getId);
        Comparator<Student> byName = Comparator.comparing(Student::getName);
        List<Student> collect = students.stream().sorted(byId.thenComparing(byName)).collect(Collectors.toList());
        System.out.println(collect);

    }
}
