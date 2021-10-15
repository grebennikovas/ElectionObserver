package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vote.golos.electionobserver.Entities.Static.Commission;

import javax.persistence.*;

@Entity(name = "commission_history")
@Data
@ToString
@NoArgsConstructor
// Участок в определенные выборы на определенном округе
public class CommissionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // участок в справочнике
    @ManyToOne
    @JoinColumn (name="commission_id", nullable = false)
    private Commission commission;
    // округ, на котором располагается участок в конкретных выборах
    @ManyToOne
    @JoinColumn(name = "district_history_id",nullable = false)
    private DistrictHistory districtHistory;
}
