package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vote.golos.electionobserver.Entities.Static.Commission;
import vote.golos.electionobserver.Entities.Static.Observer;
import vote.golos.electionobserver.Entities.Static.ObserverStatus;

import javax.persistence.*;

@Entity(name = "observer_history")
@Data
@ToString
@NoArgsConstructor
// Наблюдатель на конкретных выборах
public class ObserverHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // наблюдатель из справочника
    @ManyToOne
    @JoinColumn(name="observer_id", nullable = false)
    private Observer observer;
    // кандидат\партия, которые назначают наблюдателя
    @ManyToOne
    @JoinColumn(name="candidate_history_id", nullable = false)
    private CandidateHistory candidateHistory;
    // комиссия, в которую назначается наблюдатель
    @ManyToOne
    @JoinColumn(name = "commission_id", nullable = false)
    private Commission commission;
    // статус наблюдателя (должность)
    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private ObserverStatus observerStatus;
}
