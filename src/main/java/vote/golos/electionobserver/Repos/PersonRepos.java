package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Static.Person;

import java.util.List;

public interface PersonRepos extends JpaRepository<Person,Long> {
    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "region",
                    "region.parent"
            }
    )
    List<Person> findAll();
}
