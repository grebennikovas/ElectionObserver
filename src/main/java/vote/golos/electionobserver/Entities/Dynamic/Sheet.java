package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vote.golos.electionobserver.Entities.Static.Person;
import vote.golos.electionobserver.Entities.Static.Region;
import vote.golos.electionobserver.Entities.Static.Vote;

import javax.persistence.*;

@Entity
@Data
@ToString
@NoArgsConstructor
// Анкета наблюдателя на выборах
public class Sheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // наблюдатель из справочника
    @ManyToOne
    @JoinColumn(name="person_id", nullable = false)
    private Person person;
    // голосование
    @ManyToOne
    @JoinColumn(name="vote_id", nullable = false)
    private Vote vote;
    // город для голосования
    @ManyToOne
    @JoinColumn(name="region_id", nullable = false)
    private Region region;
    // комиссия для голосования
    @ManyToOne
    @JoinColumn(name="commission_history_id", nullable = false)
    private CommissionHistory commissionHistory;
    // член комиссии
    @Column(nullable = false)
    private boolean member;
}
