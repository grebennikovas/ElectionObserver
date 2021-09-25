package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Observer;

import java.util.List;

public interface ObserverServiceInterface {
    List<Observer> getAll();
    Observer addObserver(Observer observer);
}
