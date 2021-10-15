package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Static.Person;
import vote.golos.electionobserver.Repos.ObserverRepos;
import vote.golos.electionobserver.Service.Interface.ObserverServiceInterface;

import java.util.List;
@Service
public class ObserverServiceImpl implements ObserverServiceInterface {
    @Autowired
    ObserverRepos repos;

    @Override
    public List<Person> getAll() {
        return repos.findAll();
    }

    @Override
    public Person addObserver(Person person) {
        repos.saveAndFlush(person);
        return person;
    }
}
