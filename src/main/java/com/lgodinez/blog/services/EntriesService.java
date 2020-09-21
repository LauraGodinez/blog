package com.lgodinez.blog.services;

import com.lgodinez.blog.models.Entries;
import java.util.List;

public interface EntriesService {
    List<Entries>findAll();
    List<Entries> findLast5();
    Entries create(Entries entries);
    Entries edit(Entries entries);
    void deleteById(Integer id);
}
