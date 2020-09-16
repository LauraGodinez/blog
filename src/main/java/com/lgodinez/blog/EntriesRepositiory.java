package com.lgodinez.blog;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntriesRepositiory extends CrudRepository<Entries, Integer>
 {
}
