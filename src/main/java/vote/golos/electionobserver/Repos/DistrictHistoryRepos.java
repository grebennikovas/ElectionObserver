package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Dynamic.DistrictHistory;

public interface DistrictHistoryRepos extends JpaRepository<DistrictHistory,Long> {
}
