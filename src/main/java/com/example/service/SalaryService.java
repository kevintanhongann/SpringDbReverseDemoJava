package com.example.service;

import com.example.employees.tables.records.SalariesRecord;
import org.jooq.Result;

/**
 * Created by kevintan on 02/01/2016.
 */
public interface SalaryService {
    Result<SalariesRecord> getSalaries();
}
