package com.lgodinez.blog.controllers;

import com.lgodinez.blog.models.Entries;
import com.lgodinez.blog.EntriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class EntriesController {

    @Autowired
    private EntriesRepository entriesRepository;

    @RequestMapping(path = "/")
    public List<Entries> entries(){
        return (List<Entries>) this.entriesRepository.findAll();
    }

}
