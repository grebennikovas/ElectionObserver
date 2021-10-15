package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Static.ObserverStatus;

public interface ObserverStatusRepos extends JpaRepository<ObserverStatus,Long> {
}
