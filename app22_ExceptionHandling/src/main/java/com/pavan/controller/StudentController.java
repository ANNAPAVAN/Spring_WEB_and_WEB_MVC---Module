package com.pavan.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.pavan.command.Student;
import com.pavan.exception.StudentMarksOutOfBoundsException;

@Controller
public class StudentController {

    @GetMapping("/reg")
    public String showStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "student_form";
    }

    @PostMapping("/reg")
    public String registration(@ModelAttribute("student") Student student) {
    	if(student.getSmarks()<0 || student.getSmarks()>100) {
    		throw new StudentMarksOutOfBoundsException("Invalid Student Marks , please provide in range from 0 to 100");
    	}
        // Return the name of the view where you want to display registration details
        return "studentdetails";
    }
}
