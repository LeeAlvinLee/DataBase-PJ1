package com.example.demo.service;

import com.example.demo.model.Update;
import com.example.demo.repository.DeleteRepository;

import java.util.ArrayList;

public class DeleteService {
    private DeleteRepository deleteRepository = new DeleteRepository();
    private String deleteQuery = "DELETE FROM EMPLOYEE WHERE ssn=";

    public void delete(Update updateInfo){
        deleteRepository.delete(makeDeleteQuery(updateInfo));
    }

    private ArrayList<String> makeDeleteQuery(Update updateInfo){
        ArrayList<String> queries = new ArrayList<>();
        for(String ssn : updateInfo.getSsn()){
            queries.add(deleteQuery + ssn);
        }
        return queries;
    }
}
