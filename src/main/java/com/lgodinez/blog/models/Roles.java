
package com.lgodinez.blog.models;

import javax.persistence.*;
import java.util.*;



@Entity
@Table(name="roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Roles() {

    }

    public Roles(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}