package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vote.golos.electionobserver.Entities.Static.Person;

import javax.persistence.*;

@Entity
@Data
@ToString
@NoArgsConstructor
// Координаторы наблюдателей
public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // подчиненный наблюдатель
    @ManyToOne
    @JoinColumn (name="person_id", nullable = false)
    private Person person;
    // координатор
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Person coordinator;
}
