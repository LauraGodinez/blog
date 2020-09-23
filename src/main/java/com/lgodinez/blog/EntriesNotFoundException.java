package com.lgodinez.blog;

public class EntriesNotFoundException extends RuntimeException {

    public EntriesNotFoundException(Integer id){
        super("Could not find entry" +id);
    }
}
