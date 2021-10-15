package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vote.golos.electionobserver.Entities.Static.Vote;
import vote.golos.electionobserver.Entities.Static.District;

import javax.persistence.*;

@Entity(name = "district_history")
@Data
@ToString
@NoArgsConstructor
// Округ на определенных выборах
public class DistrictHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // голосование, в рамках которых задействован округ
    @ManyToOne
    @JoinColumn(name = "vote_id", nullable = false)
    private Vote vote;
    // округ, в котором проходит голосование
    @ManyToOne
    @JoinColumn(name = "district_id",nullable = false)
    private District district;
}
