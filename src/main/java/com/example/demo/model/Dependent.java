package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Dependent {

    // @NotEmpty(message = "Ssn은 반드시 입력해야 합니다!")
    private String Parent_name;

    private String Dependent_name;
    private String Sex;

    private String Bdate;

    private String Relationship;

    // INSERT INTO EMPLOYEE VALUES ('Test', 'T', 'test', '111111111', '1998-11-07', 'Seoul, Mapo', 'M', 90000, '333445555', 5);
    @Override
    public String toString() {
        return "(" +
                change(Parent_name) + ", " +
                change(Dependent_name) + ", " +
                change(Sex) + ", " +
                change(Bdate) + ", " +
                change(Relationship);
    }

    public String change(String str){
        return "'" + str + "'";
    }
}
