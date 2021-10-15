package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Dynamic.Enroll;

public interface EnrollRepos extends JpaRepository<Enroll,Long> {
}
