package com.lgodinez.blog;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntriesRepository extends CrudRepository<Entries, Integer> {
}
