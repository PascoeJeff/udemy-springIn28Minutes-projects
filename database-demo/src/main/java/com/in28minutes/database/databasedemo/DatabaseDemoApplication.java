package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.dao.PersonJdbcDao;
import com.in28minutes.database.databasedemo.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJdbcDao dao;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All user -> {}", dao.findAll());
        logger.info("Find user 100001 -> {}", dao.findById(100001));
        logger.info("Deleting 100002 -> {}", dao.deleteById(100002));
        logger.info("Find user with name Jeff -> {}", dao.findByName("Jeff"));
        logger.info("Inserting user 100007 -> {}", dao.insert(new Person(100007, "Ferris Bueller", "Chicago", new Date())));
        logger.info("Updating user 100007 -> {}", dao.update(new Person(100007, "Ferris Mueller", "Chicago", new Date())));
    }
}
