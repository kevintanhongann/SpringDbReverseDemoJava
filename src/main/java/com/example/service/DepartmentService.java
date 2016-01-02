package com.example.service;

import com.example.employees.tables.Departments;
import com.example.employees.tables.records.DepartmentsRecord;
import org.jooq.Result;

import java.util.List;

/**
 * Created by kevintan on 02/01/2016.
 */
public interface DepartmentService {
    Result<DepartmentsRecord> getDepartments();
}
