package com.example.service;

import com.example.employees.tables.Salaries;
import com.example.employees.tables.records.SalariesRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kevintan on 02/01/2016.
 */
public class DefaultSalaryService implements SalaryService {

    @Autowired
    DSLContext dsl;

    @Override
    public Result<SalariesRecord> getSalaries() {
        return dsl.selectFrom(Salaries.SALARIES).fetch();
    }


}
