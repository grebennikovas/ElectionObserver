package vote.golos.electionobserver.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import vote.golos.electionobserver.Entities.Dynamic.Lecture;

public interface LectureRepos extends JpaRepository<Lecture,Long> {
}
