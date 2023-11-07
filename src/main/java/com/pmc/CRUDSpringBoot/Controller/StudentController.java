package com.pmc.CRUDSpringBoot.Controller;

import java.util.List;

import com.pmc.CRUDSpringBoot.Model.Student;
import com.pmc.CRUDSpringBoot.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @RequestMapping(method = RequestMethod.POST, value="/students")
    public void addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/students/{id}")
    public void updateStudent(@PathVariable Integer id, @RequestBody Student Student)
    {
        studentService.updateStudent(id, Student);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/Students/{id}")
    public void deleteStudent(@PathVariable Integer id)
    {
        studentService.deleteStudent(id);
    }
}
