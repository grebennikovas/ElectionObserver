package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Static.Material;

public interface MaterialRepos extends JpaRepository<Material, Long> {
}
