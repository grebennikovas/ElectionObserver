package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Campaign;
import vote.golos.electionobserver.Entities.Observer;

import java.util.List;

public interface CampaignRepos extends JpaRepository<Campaign,Long> {
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "region",
                    "region.parent"
            }
    )
    List<Campaign> findAll();
}
