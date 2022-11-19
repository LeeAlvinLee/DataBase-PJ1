package com.example.demo.service;

import com.example.demo.model.DepartmentSalary;
import com.example.demo.repository.DepartmentSalaryRepository;

public class DepartmentSalaryService {
    DepartmentSalaryRepository departmentsalaryRepository=new DepartmentSalaryRepository();

    public boolean changedepartmentSal(DepartmentSalary dpSalary) {
        return departmentsalaryRepository.changedepartmentSal(changeDepartmentSalaryQuery(dpSalary));
    }
    private String changeDepartmentSalaryQuery(DepartmentSalary dpSalary){
        System.out.println(dpSalary.getDpsalary());
        return "update EMPLOYEE SET salary =" + dpSalary.salarytoString()+ " where dno = " + dpSalary.dnotoString();

    }

    private String change(String str){
        return "'" + str + "'";
    }
}
