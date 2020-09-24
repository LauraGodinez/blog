package com.lgodinez.blog.Repositories;

import com.lgodinez.blog.models.Entries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntriesRepository extends JpaRepository<Entries, Integer> {

}
