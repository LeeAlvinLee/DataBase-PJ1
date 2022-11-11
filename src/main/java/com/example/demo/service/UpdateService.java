package com.example.demo.service;

import com.example.demo.model.Update;
import com.example.demo.repository.DeleteRepository;
import com.example.demo.repository.UpdateRepository;

import java.util.ArrayList;

public class UpdateService {
    UpdateRepository updateRepository = new UpdateRepository();

    // 예시 SQL : UPDATE EMPLOYEE SET SALARY = 70000 WHERE Ssn = 111111111;
    private String updateQuery = "UPDATE EMPLOYEE SET ";

    public boolean update(Update updateInfo){
        return updateRepository.update(makeUpdateQuery(updateInfo));
    }

    private ArrayList<String> makeUpdateQuery(Update updateInfo){
        String uq = updateQuery + updateInfo.getUpdateCategory().toUpperCase() + "=" + change(updateInfo.getUpdateText()) + " WHERE Ssn = ";
        ArrayList<String> queries = new ArrayList<>();
        for(String ssn : updateInfo.getSsn()){
            queries.add(uq + ssn);
        }
        return queries;
    }

    private String change(String str){
        return "'" + str + "'";
    }
}
