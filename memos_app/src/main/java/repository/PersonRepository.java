package repository;

import domain.Person;


public interface PersonRepository {

    public Person getPersonByHandle(String githubHndle);
    public void savePerson(Person person);
}
