package com.lgodinez.blog.Repositories;

import com.lgodinez.blog.models.Entries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface EntriesRepository extends JpaRepository<Entries, Integer> {

    List<Entries> findById(Integer id);


}
