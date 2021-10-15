package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Static.Candidate;

public interface CandidateRepos extends JpaRepository<Candidate,Long> {
}
