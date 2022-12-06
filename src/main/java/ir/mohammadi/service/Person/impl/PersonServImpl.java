package ir.mohammadi.service.Person.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Person;
import ir.mohammadi.repository.Person.PersonRepo;
import ir.mohammadi.service.Person.PersonServ;

public class PersonServImpl extends BaseServiceImpl<Person, PersonRepo> implements PersonServ {
    public PersonServImpl(PersonRepo repository) {
        super(repository);
    }
}
