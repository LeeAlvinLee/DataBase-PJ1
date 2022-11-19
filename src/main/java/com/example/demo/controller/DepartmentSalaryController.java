package com.example.demo.controller;

import com.example.demo.model.DepartmentSalary;
import com.example.demo.service.DepartmentSalaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class DepartmentSalaryController {
    //postMapping(value="")

    List<String> dnoList = new ArrayList<>(Arrays.asList("1", "4", "5"));
    private DepartmentSalaryService departmentSalaryService = new DepartmentSalaryService();

    @GetMapping("/departmentSalaryPage")
    private String departmentSalaryPage(){return "/jsp/departmentSalary.jsp";}

    @PostMapping("/updateSalary")
    private String departmentSal(@ModelAttribute DepartmentSalary departmentSalary, Model model){
        System.out.println(departmentSalary.getDpdno());
        boolean departmentSal = departmentSalaryService.changedepartmentSal(departmentSalary);
        if(departmentSal && dnoList.contains(departmentSalary.getDpdno()))
            return "/jsp/home.jsp";
        else
            return "/jsp/departmentSalFail.jsp";
    }
}
