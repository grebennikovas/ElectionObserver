package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Dynamic.CommissionHistory;

public interface CommissionHistoryRepos extends JpaRepository<CommissionHistory,Long> {
}
