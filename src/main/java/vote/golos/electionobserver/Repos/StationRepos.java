package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Region;
import vote.golos.electionobserver.Entities.Station;

import java.util.List;

public interface StationRepos extends JpaRepository<Station,Long> {
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "parent"
            }
    )
    List<Station> findByParent(Station Parent);
}
