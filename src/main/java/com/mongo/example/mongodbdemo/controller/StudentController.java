/*
 * Author Name:
 * Date: 11/24/2022
 * Created With: IntelliJ IDEA Community Edition
 */


package com.mongo.example.mongodbdemo.controller;

import com.mongo.example.mongodbdemo.domain.Student;
import com.mongo.example.mongodbdemo.repository.StudentRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
 @RequestMapping(value = "/student")
public class StudentController {
    @Autowired
 private   StudentRepositroy studentRepositroy;

    @Autowired
    public StudentController(StudentRepositroy studentRepositroy) {
        this.studentRepositroy = studentRepositroy;
    }

    @PostMapping(value = "/students")
    public ResponseEntity<?> addStudentDetails(@RequestBody Student student){

         Student save = this.studentRepositroy.save(student);
         return ResponseEntity.ok(save);
    }

    @GetMapping(value = "/getstud")

    public ResponseEntity<?> getStudentsDetailes(){

        return ResponseEntity.ok(this.studentRepositroy.findAll());
    }
}
