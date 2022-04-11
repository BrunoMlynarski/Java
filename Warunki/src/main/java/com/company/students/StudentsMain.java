package main.java.com.company.students;

public class StudentsMain {

    public static void main(String[] args) {

        Students one = new Students("Bruno","Mlynarski",18);
        Students two = new Students("Tomasz","Bazan",18);

        Training practises = new Training("Java");
        Training cooking = new Training("Delicious");

        practises.addStudent(one);
        practises.addStudent(two);
        cooking.addStudent(two);

        System.out.println(practises.printStudents3());




    }
}
