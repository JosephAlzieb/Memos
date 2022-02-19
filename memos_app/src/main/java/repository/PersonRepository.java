package repository;

import domain.Person;


public interface PersonRepository {

    public Person getPersonById(int id);
    public boolean savePerson(Person person);
}
