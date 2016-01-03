package com.example.service;

import com.example.domain.Salary;
import com.example.employees.tables.records.SalariesRecord;
import org.jooq.Result;

import java.util.List;

/**
 * Created by kevintan on 02/01/2016.
 */
public interface SalaryService {
    List<Salary> getSalaries();
    List<Salary> getSalaries(int page, int size);
}
