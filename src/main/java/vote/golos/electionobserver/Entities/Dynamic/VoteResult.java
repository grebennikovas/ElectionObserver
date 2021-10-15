package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    @JoinColumn (name="observer_id", nullable = false)
    private Observer observer;
    // вид результата
    @ManyToOne
    @JoinColumn (name="runner_id", nullable = false)
    private Runner runner;
    @Column(nullable = false)
    private int result;
}
