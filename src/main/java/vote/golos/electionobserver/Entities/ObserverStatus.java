package vote.golos.electionobserver.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "observer_status")
@Data
@ToString
@NoArgsConstructor
public class ObserverStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // наименование статуса
    @Column(nullable = false)
    String name;
    // кор. наименование статуса
    @Column (name = "short_name", nullable = false)
    String shortName;
}
