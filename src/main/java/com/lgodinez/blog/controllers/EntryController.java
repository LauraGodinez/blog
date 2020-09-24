package com.lgodinez.blog.controllers;

import com.lgodinez.blog.EntriesNotFoundException;
import com.lgodinez.blog.models.Entries;
import com.lgodinez.blog.Repositories.EntriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController()
public class EntryController {

    @Autowired
    private EntriesRepository entryRepository;

    @PostMapping("/entry")
    Entries newEntry(@RequestBody Entries newEntry){
        return entryRepository.save(newEntry);
    }

    @GetMapping("/entry/{id}")
    Entries findEntry(@PathVariable Integer id) {
        Entries entry = entryRepository.findById(id).get();
        if (entry==null){
            throw new EntriesNotFoundException(id);
        }

        return entry;
    }

    @PutMapping("/entry/{id}")
    public ResponseEntity<Entries> updateEntry(@PathVariable(value = "id") Integer id,
                                               @Validated @RequestBody Entries entryDetails) throws EntriesNotFoundException {
        Entries entry = entryRepository.findById(id).orElse(null);

        if (entry==null){
            throw new EntriesNotFoundException(id);
        }

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