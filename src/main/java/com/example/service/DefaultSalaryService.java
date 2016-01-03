package com.example.service;

import com.example.domain.Salary;
import com.example.employees.tables.Salaries;
import com.example.employees.tables.records.SalariesRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by kevintan on 02/01/2016.
 */
@Service
public class DefaultSalaryService implements SalaryService {

    @Autowired
    DSLContext dsl;

    @Override
    public List<Salary> getSalaries() {
        return dsl.selectFrom(Salaries.SALARIES).fetchInto(Salary.class);
    }

    @Override
    public List<Salary> getSalaries(int page, int size) {
        return dsl.selectFrom(Salaries.SALARIES).limit(page, size).fetchInto(Salary.class);
    }


}
