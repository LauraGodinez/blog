package com.lgodinez.blog;

import com.lgodinez.blog.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends CrudRepository<User,Integer> {
}
