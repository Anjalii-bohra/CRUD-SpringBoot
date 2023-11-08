package com.pmc.CRUDSpringBoot.Controller;

import java.util.List;

import com.pmc.CRUDSpringBoot.Model.Student;
import com.pmc.CRUDSpringBoot.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/students/list")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @PostMapping("/students/add")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentService.addStudent(student.getId(), student.getName(), student.getBranch());
        return ResponseEntity.ok("Student added successfully.");
    }

    @RequestMapping(method = RequestMethod.PUT, value="/students/update/{id}")
    public void updateStudent(@PathVariable Integer id, @RequestBody Student student)
    {
        studentService.updateStudent(id, student);
    }
    @RequestMapping(method = RequestMethod.DELETE, value="/students/delete/{id}")
    public void deleteStudent(@PathVariable Integer id)
    {
        studentService.deleteStudent(id);
    }
}
