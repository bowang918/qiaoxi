package com.qx021.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.qx021.model.Person;

import java.util.List;

/**
 * Specifies methods used to obtain and modify person related information
 * which is stored in the database.
 * @author Seven7
 */
public interface PersonRepository extends JpaRepository<Person, Long>, PaginatingPersonRepository, QueryDslPredicateExecutor<Person> {

}
