package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vote.golos.electionobserver.Entities.Static.Commission;
import vote.golos.electionobserver.Entities.Static.Observer;

import javax.persistence.*;

@Entity(name = "coordinate_history")
@Data
@ToString
@NoArgsConstructor
// Участок в определенные выборы на определенном округе
public class CoordinateHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // подчиненный наблюдатель
    @ManyToOne
    @JoinColumn (name="observer_id", nullable = false)
    private Observer observer;
    // координатор
    @ManyToOne
    @JoinColumn
    private Observer coordinator;
}
