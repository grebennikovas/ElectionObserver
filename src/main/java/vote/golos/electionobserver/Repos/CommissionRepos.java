package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Static.Commission;

import java.util.List;

public interface CommissionRepos extends JpaRepository<Commission,Long> {
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "parent",
                    "city.parent"
            }
    )
    List<Commission> findByParent(Commission Parent);
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "city.parent"
            }
    )
    List<Commission> findAllBy();
}
