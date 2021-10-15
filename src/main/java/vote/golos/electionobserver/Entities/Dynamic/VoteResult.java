package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vote.golos.electionobserver.Entities.Static.Observer;
import vote.golos.electionobserver.Entities.Static.ResultType;

import javax.persistence.*;

@Entity(name = "vote_result")
@Data
@ToString
@NoArgsConstructor
public class VoteResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // наблюдатель и его участок
    @ManyToOne
    @JoinColumn (name="observer_history_id", nullable = false)
    private ObserverHistory observerHistory;
    // вид результата
    @ManyToOne
    @JoinColumn (name="candidate_history_id", nullable = false)
    private CandidateHistory candidateHistory;
    @Column(nullable = false)
    private int result;
}
