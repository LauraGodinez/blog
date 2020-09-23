package com.lgodinez.blog.controllers;

import com.lgodinez.blog.EntriesNotFoundException;
import com.lgodinez.blog.models.Entries;
import com.lgodinez.blog.Repositories.EntriesRepository;
import com.sun.tools.classfile.ConstantPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

import java.util.List;

@RestController()
@RequestMapping
public class EntriesController {

    @Autowired
    private EntriesRepository entriesRepository;

    EntriesController(EntriesRepository entriesRepository) {
        this.entriesRepository = entriesRepository;
    }

    @GetMapping("/index")
    List<Entries> all() {
        return entriesRepository.findAll();
    }


}





