package ir.mohammadi.repository.Person.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Person;
import ir.mohammadi.repository.Person.PersonRepo;
import jakarta.persistence.EntityManager;

public class PersonRepoImpl extends BaseRepositoryImpl<Person> implements PersonRepo{
    public PersonRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Person> getEntityClass() {
        return Person.class;
    }
}
