package com.example.service;

import com.example.employees.tables.records.TitlesRecord;
import org.jooq.Result;

/**
 * Created by kevintan on 02/01/2016.
 */
public interface TitleService {
    Result<TitlesRecord> getTitles();
}
