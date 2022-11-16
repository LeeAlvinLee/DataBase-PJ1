package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Search {
    private String name = "";
    private String ssn = "";
    private String bDate = "";
    private String address = "";
    private String sex = "";
    private String salary = "";
    private String supervisor = "";
    private String department = "";

    private String created_at = "";

    private String updated_at = "";

    @Override
    public String toString() {
        return "Search{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", bDate='" + bDate + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", salary='" + salary + '\'' +
                ", supervisor='" + supervisor + '\'' +
                ", department='" + department + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\''+
                '}';
    }
}
