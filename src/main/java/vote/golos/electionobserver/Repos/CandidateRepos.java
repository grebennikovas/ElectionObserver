package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Candidate;
import vote.golos.electionobserver.Entities.Observer;

public interface CandidateRepos extends JpaRepository<Candidate,Long> {
}
