package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Dynamic.Lead;

public interface LeadRepos extends JpaRepository<Lead,Long> {
}
