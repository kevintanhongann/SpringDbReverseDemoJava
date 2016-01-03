package com.example.web;

import com.example.domain.Salary;
import com.example.employees.tables.records.SalariesRecord;
import com.example.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    List<Salary> getSalaries() {
        return salaryService.getSalaries(1, 10);
    }

    @RequestMapping(value = "/salary", params = {"page", "size"}, method = RequestMethod.GET)
    @ResponseBody
    List<Salary> getSalaries(@RequestParam("page") int page, @RequestParam("size") int size) {
        return salaryService.getSalaries(page, size);
    }
}
