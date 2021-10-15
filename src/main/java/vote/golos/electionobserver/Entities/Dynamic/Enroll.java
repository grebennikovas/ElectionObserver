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
// Записи на занятие
public class Enroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // занятие
    @ManyToOne
    @JoinColumn(name="lecture_id", nullable = false)
    private Lecture lecture;
    // наблюдатель
    @ManyToOne
    @JoinColumn(name="person_id", nullable = false)
    private Person person;
    // флаг посещения
    @Column(nullable = false)
    boolean visited;
}
