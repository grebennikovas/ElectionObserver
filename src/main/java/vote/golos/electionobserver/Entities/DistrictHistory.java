package vote.golos.electionobserver.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    // выборы, в рамках которых задействован округ
    @ManyToOne
    @JoinColumn(name = "campaign_id", nullable = false)
    private Campaign campaign;
    // округ из справочника
    @ManyToOne
    @JoinColumn(name = "district_id",nullable = false)
    private District district;
}
