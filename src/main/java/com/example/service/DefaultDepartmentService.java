package com.example.service;

import com.example.domain.Department;
import com.example.employees.tables.Departments;
import com.example.employees.tables.records.DepartmentsRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kevintan on 02/01/2016.
 */
@Service
public class DefaultDepartmentService implements DepartmentService{

    @Autowired
    DSLContext dsl;

    @Override
    public List<Department> getDepartments() {
        return dsl.selectFrom(Departments.DEPARTMENTS).fetchInto(Department.class);
    }

}
