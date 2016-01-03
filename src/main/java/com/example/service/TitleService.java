package com.example.service;

import com.example.domain.Title;
import com.example.employees.tables.records.TitlesRecord;
import org.jooq.Result;

import java.util.List;

/**
 * Created by kevintan on 02/01/2016.
 */
public interface TitleService {
    List<Title> getTitles();
}
