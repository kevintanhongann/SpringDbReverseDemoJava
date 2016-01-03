package com.example.web;

import com.example.employees.tables.records.TitlesRecord;
import com.example.service.TitleService;
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
public class TitleController {

    @Autowired
    TitleService titleService;

    @RequestMapping(value = "/title", method = RequestMethod.GET)
    @ResponseBody
    List<TitlesRecord> getTitles(){
        return titleService.getTitles();
    }

}
