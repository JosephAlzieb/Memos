package servives;

import domain.Person;
import repository.PersonRepository;

public class PersonService {

    private PersonRepository repository;


    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person getPersonByHandle(String githubHandle){
        return repository.getPersonByHandle(githubHandle);
    }

    public void savePerson(Person person){
        repository.savePerson(person);
    }
}
