package vote.golos.electionobserver.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "candidate_history")
@Data
@ToString
@NoArgsConstructor
// Кандидат\партия , который есть в бюллетене в определенном округе, может выдвигать наблюдателей
public class CandidateHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // округ, в котором выдвигается
    @ManyToOne
    @JoinColumn(name="district_history_id",nullable = false)
    private DistrictHistory districtHistory;
    // партия, которая выдвигает (кандидата или себя)
    @ManyToOne
    @JoinColumn(name = "party_id")
    private Party party;
    // кандидат, который выдвигается (от партии или сам)
    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
