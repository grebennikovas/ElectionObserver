package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vote.golos.electionobserver.Entities.Static.Commission;
import vote.golos.electionobserver.Entities.Static.ResultType;

import javax.persistence.*;

@Entity(name = "common_result")
@Data
@ToString
@NoArgsConstructor
public class CommonResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // наблюдатель и его участок
    @ManyToOne
    @JoinColumn (name="observer_history_id", nullable = false)
    private ObserverHistory observerHistory;
    // вид результата
    @ManyToOne
    @JoinColumn (name="result_type_id", nullable = false)
    private ResultType resultType;
    @Column(nullable = false)
    private int result;
}
