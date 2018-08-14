package com.in28minutes.database.databasedemo;

import com.in28minutes.database.databasedemo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
