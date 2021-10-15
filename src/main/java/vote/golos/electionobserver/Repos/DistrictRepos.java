package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Static.District;

import java.util.List;

public interface DistrictRepos extends JpaRepository<District,Long> {
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "campaign",
                    "region",
                    "region.parent"
            }
    )
    public List<District> findAll();
}
