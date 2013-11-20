package com.qx021.repository;

import com.mysema.query.types.Predicate;
import com.qx021.model.QPerson;

/**
 * A class which is used to create Querydsl predicates.
 * 
 * @author Seven7
 */
public class PersonPredicates {

	public static Predicate lastNameIsLike(final String searchTerm) {
		QPerson person = QPerson.person;
		return person.lastName.startsWithIgnoreCase(searchTerm);
	}
}
