package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Dynamic.Sheet;

public interface SheetRepos extends JpaRepository<Sheet,Long> {
}
