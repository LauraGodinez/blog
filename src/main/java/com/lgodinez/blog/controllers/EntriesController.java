package com.lgodinez.blog.controllers;

import com.lgodinez.blog.models.Entries;
import com.lgodinez.blog.Repositories.EntriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class EntriesController {

    @Autowired
    private EntriesRepository entriesRepository;

    @GetMapping("/entries")
    List<Entries> all() {
        return entriesRepository.findAll();
    }


}





