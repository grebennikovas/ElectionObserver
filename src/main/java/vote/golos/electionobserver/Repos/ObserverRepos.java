package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import vote.golos.electionobserver.Entities.Observer;

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
