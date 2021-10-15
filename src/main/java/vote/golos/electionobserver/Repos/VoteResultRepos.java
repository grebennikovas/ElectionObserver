package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Dynamic.VoteResult;

public interface VoteResultRepos extends JpaRepository<VoteResult,Long> {
}
