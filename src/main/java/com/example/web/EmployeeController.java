package com.example.web;

import com.example.domain.Employee;
import com.example.employees.tables.records.EmployeesRecord;
import com.example.service.EmployeeService;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kevintan on 02/01/2016.
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    @ResponseBody
    List<Employee> getEmployees(){
        List<Employee> employees = employeeService.getEmployees();
        System.out.println("employees "+employees);
        return employees;
    }

}
