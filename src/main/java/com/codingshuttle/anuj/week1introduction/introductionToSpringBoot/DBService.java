package com.codingshuttle.anuj.week1introduction.introductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

//    @Autowired
//    final only work if there is constructor
    private DB db;
//    private DevDB db;

    public DBService(DB db){
        this.db = db;
    }

    String getData(){
        return db.getData();
    }
}
