package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Dynamic.Runner;

public interface RunnerRepos extends JpaRepository<Runner,Long> {
}
