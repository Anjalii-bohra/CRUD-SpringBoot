package com.pmc.CRUDSpringBoot.Service;

import com.pmc.CRUDSpringBoot.Model.Student;
import com.pmc.CRUDSpringBoot.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    public List<Student> getAllStudents()
    {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public void addStudent(Integer id, String name, String branch) {
        Student studentUser = new Student();
        studentUser.setId(id);
        studentUser.setName(name);
        studentUser.setBranch(branch);
        studentRepository.save(studentUser);
    }

    public void updateStudent(Integer id, Student student) {

        studentRepository.save(student);
    }

    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

}
