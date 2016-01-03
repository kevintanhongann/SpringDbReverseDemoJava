package com.example.service;

import com.example.employees.tables.Titles;
import com.example.employees.tables.records.TitlesRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kevintan on 02/01/2016.
 */
public class DefaultTitleService implements TitleService{

    @Autowired
    DSLContext dsl;

    @Override
    public Result<TitlesRecord> getTitles() {
        return dsl.selectFrom(Titles.TITLES).fetch();
    }


}
