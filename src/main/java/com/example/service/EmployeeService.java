package com.example.service;

import com.example.domain.Employee;
import com.example.employees.tables.records.EmployeesRecord;
import org.jooq.Result;
import org.jooq.Results;

import java.util.List;

/**
 * Created by kevintan on 02/01/2016.
 */
public interface EmployeeService {
    List<Employee> getEmployees();
}
