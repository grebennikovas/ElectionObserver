package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Dynamic.CommonResult;

public interface CommonResultRepos extends JpaRepository<CommonResult,Long> {
}
