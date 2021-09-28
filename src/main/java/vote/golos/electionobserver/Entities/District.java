package vote.golos.electionobserver.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@NoArgsConstructor
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "district_id")
    private Long id;
    @Column(length = 250)
    private String name;
    @Column(nullable = false)
    private int number;
    @ManyToOne
    @JoinColumn
    private Region region;
    @ManyToOne
    @JoinColumn
    private Campaign campaign;
}
