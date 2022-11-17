package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.InsertRepository;

public class InsertService {

    InsertRepository insertRepository = new InsertRepository();

    public boolean insert(Employee employee){
        return insertRepository.insert(makeInsertQuery(employee));
    }

    private String makeInsertQuery(Employee employee){
        return "INSERT INTO EMPLOYEE VALUES " + employee.toString();
    }

    private String change(String str){
        return "'" + str + "'";
    }
}
