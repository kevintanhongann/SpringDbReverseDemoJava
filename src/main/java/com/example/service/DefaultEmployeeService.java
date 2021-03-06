package com.example.service;

import com.example.domain.Employee;
import com.example.employees.tables.Employees;
import com.example.employees.tables.records.EmployeesRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kevintan on 02/01/2016.
 */
@Service
public class DefaultEmployeeService implements EmployeeService{
    @Autowired
    DSLContext dsl;

    @Override
    public List<Employee>  getEmployees() {
        return dsl.selectFrom(Employees.EMPLOYEES).fetchInto(Employee.class);
    }

    @Override
    public List<Employee> getEmployees(Integer page, Integer size) {
        return dsl.selectFrom(Employees.EMPLOYEES).limit(page, size).fetchInto(Employee.class);
    }
}
