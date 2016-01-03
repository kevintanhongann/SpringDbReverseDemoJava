package com.example.web;

import com.example.employees.tables.records.SalariesRecord;
import com.example.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by kevintan on 03/01/2016.
 */
@RestController
public class SalaryController {

    @Autowired
    SalaryService salaryService;

    @RequestMapping(value = "/salary", method = RequestMethod.GET)
    @ResponseBody
    List<SalariesRecord> getSalaries(){
        return salaryService.getSalaries();
    }


}
