package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vote.golos.electionobserver.Entities.Dynamic.Observer;

import java.util.List;

public interface ObserverRepos extends JpaRepository<Observer,Long> {

    List<Observer> findAllByLead_Coordinator_Id(long coordId);
}
