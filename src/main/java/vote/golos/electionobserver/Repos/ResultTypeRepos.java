package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Static.ResultType;

public interface ResultTypeRepos extends JpaRepository<ResultType,Long> {
}
