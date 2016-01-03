package com.example.web;

import com.example.employees.tables.Departments;
import com.example.employees.tables.records.DepartmentsRecord;
import com.example.service.DepartmentService;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kevintan on 02/01/2016.
 */
@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/department")
    List<DepartmentsRecord> getDepartments(){
        return departmentService.getDepartments();
    }

}
