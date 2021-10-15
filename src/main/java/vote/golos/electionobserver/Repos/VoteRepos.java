package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Static.Vote;

import java.util.List;

public interface VoteRepos extends JpaRepository<Vote,Long> {
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "region",
                    "region.parent"
            }
    )
    List<Vote> findAll();
}
