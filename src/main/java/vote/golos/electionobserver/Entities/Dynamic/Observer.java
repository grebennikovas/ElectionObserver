package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vote.golos.electionobserver.Entities.Static.Commission;
import vote.golos.electionobserver.Entities.Static.ObserverStatus;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@ToString
@NoArgsConstructor
// Наблюдатель на конкретных выборах
public class Observer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // наблюдатель из справочника
    @ManyToOne
    @JoinColumn(name="lead_id", nullable = false)
    private Lead lead;
    // кандидат\партия, которые назначают наблюдателя
    @ManyToOne
    @JoinColumn(name="runner_id", nullable = false)
    private Runner runner;
    // комиссия, в которую назначается наблюдатель
    @ManyToOne
    @JoinColumn(name = "commission_id", nullable = false)
    private Commission commission;
    // статус наблюдателя (должность)
    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private ObserverStatus observerStatus;
    @Column
    Timestamp accepted;

}
