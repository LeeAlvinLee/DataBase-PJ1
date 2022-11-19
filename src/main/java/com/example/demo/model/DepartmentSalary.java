package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DepartmentSalary {
    private String dpsalary;

    private String dpdno;

    public DepartmentSalary(String salary, String dno){
        this.dpsalary= salary;
        this.dpdno=dno;
    }
    public String salarytoString(){
        return "'" + dpsalary + "'";
    }

    public String dnotoString(){
        return "'" + dpdno + "'";
    }
}
