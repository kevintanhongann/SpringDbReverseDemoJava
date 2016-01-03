package com.example.service;

import com.example.employees.tables.records.EmployeesRecord;
import org.jooq.Result;
import org.jooq.Results;

/**
 * Created by kevintan on 02/01/2016.
 */
public interface EmployeeService {
    Result<EmployeesRecord> getEmployees();
}
