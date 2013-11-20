package com.qx021.repository;

import com.mysema.query.types.Predicate;
import com.mysema.query.types.expr.BooleanExpression;
import com.qx021.repository.PersonPredicates;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * @author Seven7
 */
public class PersonPredicatesTest {
    
    private static final String SEARCH_TERM = "Foo";
    private static final String EXPECTED_PREDICATE_STRING = "startsWithIgnoreCase(person.lastName,Foo)";

    @Test
    public void lastNameLike() {
        Predicate predicate = PersonPredicates.lastNameIsLike(SEARCH_TERM);
        String predicateAsString = predicate.toString();
        assertEquals(EXPECTED_PREDICATE_STRING, predicateAsString);
    }
}
