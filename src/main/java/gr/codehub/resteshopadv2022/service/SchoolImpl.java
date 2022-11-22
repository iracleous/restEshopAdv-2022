package gr.codehub.resteshopadv2022.service;

import gr.codehub.resteshopadv2022.model.Student;
import gr.codehub.resteshopadv2022.repository.Repository;

import java.util.List;

public class SchoolImpl implements School{
    private final Repository<Student> studentRepository;

    public SchoolImpl(Repository<Student> studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public int registerStudent(Student student) {
        //validations
        return studentRepository.create(student);
    }

    @Override
    public List<Student> displayStudents() {
        return studentRepository.read();
    }
}
