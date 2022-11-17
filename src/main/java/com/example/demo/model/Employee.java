package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.text.SimpleDateFormat;

@Getter @Setter
public class Employee {
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String timeStamp = date.format(new Date());

    // @NotEmpty(message = "Ssn은 반드시 입력해야 합니다!")
    private String ssn;

    private String fname;
    private String minit;
    private String lname;
    private String bdate;
    private String address;
    private String sex;
    private String salary;
    private String super_ssn;
    private String dno;

    private String created_at;

    private String updated_at;
    // INSERT INTO EMPLOYEE VALUES ('Test', 'T', 'test', '111111111', '1998-11-07', 'Seoul, Mapo', 'M', 90000, '333445555', 5);
    @Override
    public String toString() {
        return "(" +
                change(fname) + ", " +
                change(minit) + ", " +
                change(lname) + ", " +
                change(ssn) + ", " +
                change(bdate) + ", " +
                change(address) + ", " +
                change(sex) + ", " +
                salary + ", " +
                change(super_ssn) + ", " +
                dno + "," +
                change(timeStamp)+ ", "+
                change(timeStamp)+
                ")"+';'
                ;
    }

    public String change(String str){
        return "'" + str + "'";
    }
}
