package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Static.Observer;

import java.util.List;

public interface ObserverRepos extends JpaRepository<Observer,Long> {
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "region",
                    "region.parent"
            }
    )
    List<Observer> findAll();
}
