package com.in28minutes.database.databasedemo.jpa;

import com.in28minutes.database.databasedemo.domain.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

//Repository
//Transaction
@Repository
@Transactional
public class PersonJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    //connect to the database
    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }
}
