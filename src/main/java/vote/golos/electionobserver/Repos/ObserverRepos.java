package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Dynamic.Observer;

public interface ObserverRepos extends JpaRepository<Observer,Long> {
}
