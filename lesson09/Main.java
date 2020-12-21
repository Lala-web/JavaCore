package ru.geekbrains.lesson09;


import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Student> stream1 = getStudentStream1();
        Stream<Student> stream2 = getStudentStream2();
        List<Student> uniqueValues = Stream.concat(stream1, stream2).filter(distinctByKey(Student::getCourse)).collect(Collectors.toList());
        System.out.println("Список уникальных курсов:");
        uniqueValues.forEach(System.out::println);
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    private static Stream<Student> getStudentStream1() {

        Student e1 = new Student(1, "Ira", "Java");
        Student e2 = new Student(2, "Olya", "Java");
        Student e3 = new Student(3, "Dasha", "JavaScript");

        return Stream.of(e1, e2, e3);
    }

    private static Stream<Student> getStudentStream2() {

        Student e1 = new Student(4, "Misha", "Java");
        Student e2 = new Student(5, "Vanya", "Java");
        Student e3 = new Student(6, "Anya", "Java");
        Student e4 = new Student(7, "Stas", "JavaCore");

        return Stream.of(e1, e2, e3, e4);
    }
}

class Student {
    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course) {
        super();
        this.id = id;
        this.name = name;
        this.course = course;
    }

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
    }
}

