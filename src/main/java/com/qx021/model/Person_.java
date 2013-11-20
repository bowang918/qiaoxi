package com.qx021.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.qx021.model.Person;

/**
 * A  meta model class used to create type safe queries from person
 * information.
 * @author Seven7
 */
@StaticMetamodel(Person.class)
public class Person_ {
    public static volatile SingularAttribute<Person, String> lastName;
}
