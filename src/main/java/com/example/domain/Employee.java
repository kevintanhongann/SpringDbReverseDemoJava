package com.example.domain;

import com.example.employees.Employees;
import com.example.employees.enums.EmployeesGender;
import com.example.employees.tables.records.EmployeesRecord;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * Created by kevintan on 03/01/2016.
 */
@Data
public class Employee {

    //Integer empNo, Date birthDate, String firstName, String lastName, EmployeesGender gender, Date hireDate
    private Integer empNo;

    private Date birthDate;

    private String firstName;

    private String lastName;

    private EmployeesGender gender;

    private Date hireDate;

}
