package com.lgodinez.blog.controllers;

import com.lgodinez.blog.EntriesNotFoundException;
import com.lgodinez.blog.models.Entries;
import com.lgodinez.blog.Repositories.EntriesRepository;
import com.sun.tools.classfile.ConstantPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class EntryController {

    @Autowired
    private EntriesRepository entryRepository;

    EntryController(EntriesRepository entriesRepository) {
        this.entryRepository = entriesRepository;
    }

    @PostMapping("/entry")
    Entries newEntry(@RequestBody Entries newEntry){
        return entryRepository.save(newEntry);
    }
    @GetMapping("/Entry/{id}")Entries findEntry(@PathVariable Integer id) {
        return entryRepository.findById(id).orElseThrow(() -> new EntriesNotFoundException(id));
    }
    @PutMapping("/entry")
    public ResponseEntity<Entries> updateEntry(@PathVariable(value = "id") Integer id,
                                               @Validated @RequestBody Entries entryDetails) throws EntriesNotFoundException {
        Entries entry = entryRepository.findById(id)
                .orElseThrow(() -> new EntriesNotFoundException(id));
        entry.setTitle(entryDetails.getTitle());
        entry.setText(entryDetails.getText());
        entry.setAuthorId(entryDetails.getAuthorId());
        entry.setPublishDate(entryDetails.getPublishDate());
        Entries updatedEntry = entryRepository.save(entry);
        return ResponseEntity.ok(updatedEntry);
    }

    @DeleteMapping("/entry/{id}")
    void deleteEntry(@PathVariable Integer id) {
        entryRepository.deleteById(id);
    }
}