package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Static.Observer;

import java.util.List;

public interface ObserverServiceInterface {
    List<Observer> getAll();
    Observer addObserver(Observer observer);
}
