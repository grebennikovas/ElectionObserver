package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vote.golos.electionobserver.Entities.Static.Region;

import java.util.List;
@Repository
public interface RegionRepos extends JpaRepository<Region,Long> {
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "parent",
                    "parent.parent"
            }
    )
    List<Region> findByParent(Region Parent);
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "parent"
            }
    )
    List<Region> findByRank(int rank);
}
