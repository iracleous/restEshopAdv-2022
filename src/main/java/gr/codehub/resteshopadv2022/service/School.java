package gr.codehub.resteshopadv2022.service;

import gr.codehub.resteshopadv2022.model.Student;

import java.util.List;

public interface School {

    int registerStudent(Student student);
    List<Student> displayStudents();

}
