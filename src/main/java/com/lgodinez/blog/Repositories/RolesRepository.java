package com.lgodinez.blog.Repositories;

import com.lgodinez.blog.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends CrudRepository<User,Integer> {
}
