package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Static.Theme;

public interface ThemeRepos extends JpaRepository<Theme,Long> {
}
