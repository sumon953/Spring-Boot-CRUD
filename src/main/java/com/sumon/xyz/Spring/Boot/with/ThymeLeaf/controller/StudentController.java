package com.sumon.xyz.Spring.Boot.with.ThymeLeaf.controller;

import com.sumon.xyz.Spring.Boot.with.ThymeLeaf.entity.Student;
import com.sumon.xyz.Spring.Boot.with.ThymeLeaf.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/students/")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;


    @GetMapping("showForm")
    public String showStudentForm()
    {
        return "add-student";
    }



    @GetMapping("list")
    public String students(Model model)
    {
        model.addAttribute("student",this.studentRepository.findAll());
        return "index";
    }



    @PostMapping("add")
    public String addStudent(Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-student";
        }

        studentRepository.save(student);
        return "redirect:list";
    }



    @GetMapping("edit/{id}")
    public String showupdateform(){

    }




    @GetMapping("update/{id}")
    public String updateStudent(@PathVariable("id") Long id,Student student, BindingResult result,Model model)
    {
        if (result.hasErrors())
        {
            student.setId(id);
            return "update-student";
        }
        //Update Student;
       studentRepository.save(student);

        //Get All Student(with update)
        model.addAttribute("student",studentRepository.findAll());
        return "index";
    }

}
