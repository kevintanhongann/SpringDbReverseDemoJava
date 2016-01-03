package com.example.web;

import com.example.domain.Employee;
import com.example.employees.tables.records.EmployeesRecord;
import com.example.service.EmployeeService;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kevintan on 02/01/2016.
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee",  method = RequestMethod.GET)
    @ResponseBody
    List<Employee> getEmployees(){
        //default with page 1, size 10
        List<Employee> employees = employeeService.getEmployees(1, 10);
        System.out.println("employees "+employees);
        return employees;
    }

    @RequestMapping(value = "/employee", params = {"page", "size"},  method = RequestMethod.GET)
    @ResponseBody
    List<Employee> getEmployees(@RequestParam("page") int page,@RequestParam("size") int size){

        /*if (page == null) {
            page = 1;
        }

        if(size == null){
            size = 10;
        }*/

        List<Employee> employees = employeeService.getEmployees(page, size);
        System.out.println("employees "+employees);
        return employees;
    }

}
