package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import vote.golos.electionobserver.Entities.Dynamic.Lead;

import java.util.List;

public interface LeadRepos extends JpaRepository<Lead,Long> {
    @Transactional
    @EntityGraph(type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
            "person", "person.region", "person.region.parent", //"person.region.parent.parent",
            "coordinator", "coordinator.region", "coordinator.region.parent"//, "coordinator.region.parent.parent"
            })
    List<Lead> findAllByCoordinatorId(long coordId);
}
