package com.example.demo.service;

import com.example.demo.model.Dependent;
import com.example.demo.repository.DependentRepository;

import java.util.ArrayList;
import java.util.List;

public class ShowDependentService {

    private String showDependentQuery = "SELECT * FROM DEPENDENT WHERE Essn=";
    public ArrayList<String> makeShowChildQuery(ArrayList<String> ssn_list){
        ArrayList<String> queries = new ArrayList<>();
        for(int i=0; i < ssn_list.size(); i++){
            queries.add(showDependentQuery + ssn_list.get(i));

        }
        return queries;
    }

    public ArrayList<Dependent> getDependentInfo(ArrayList<String> queries){
        DependentRepository dependentRepository = new DependentRepository();

        return dependentRepository.showDependent(makeShowChildQuery(queries));
    }

   // public boolean searchdependent(Dependent dependent){
   //     return show
   // }
}
