package com.company.students;
//Odniesienie skad jest lista

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Training {
    String name;
    //Lista<Nazwa klasy> nazwa listy
    List<Students> studentsList;

    public Training(String name) {
        this.name = name;
        //ArrayList<>() implementacja interfacu listy
        //Nazwa listy = jest implementacja
        this.studentsList = new ArrayList<>();
    }

    //metoda dodaj studenta
    public void addStudent(Students student) {
        studentsList.add(student);
    }

    public String printStudents() {
        String list = "";

//        for (Students students : studentsList) {
//            list += students.hiStudent() + ", ";
//        }

        for (int i = 0; i < studentsList.size(); i++) {
            Students person = studentsList.get(i);
            if (i != studentsList.size() - 1) {
                list += person.hiStudent() + ", ";
            } else {
                list += person.hiStudent();
            }
        }
        return list;

    }

    public String printStudents2() {
        String list = "";

        for (Students students : studentsList) {
            list += students.hiStudent() + ", ";
        }

        return list.substring(0, list.length() - 2);
    }

    public String printStudents3() {
        return studentsList.stream().map(Students::hiStudent).collect(Collectors.joining(", "));
    }

    //przerobienie metody ToString()
    @Override
    public String toString() {
        return name + " number of students: " + studentsList.size();

    }
}
