package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Static.Person;

import java.util.List;

public interface ObserverServiceInterface {
    List<Person> getAll();
    Person addObserver(Person person);
}
