package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Observer;
import vote.golos.electionobserver.Entities.Party;

public interface PartyRepos extends JpaRepository<Party,Long> {
}
