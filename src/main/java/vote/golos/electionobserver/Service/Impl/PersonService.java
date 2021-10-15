package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Static.Person;
import vote.golos.electionobserver.Repos.PersonRepos;
import vote.golos.electionobserver.Service.Interface.Crudable;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements Crudable<Person,Long> {
    @Autowired
    PersonRepos repos;

    @Override
    public Person add(Person value) {
        return repos.saveAndFlush(value);
    }

    @Override
    public Optional<Person> findById(Long id) {
        return repos.findById(id);
    }

    @Override
    public List<Person> findAll() {
        return repos.findAll();
    }
}
