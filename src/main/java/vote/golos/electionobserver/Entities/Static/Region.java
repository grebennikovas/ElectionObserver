package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@NoArgsConstructor
// иерархический справочник регионов
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // наименование региона
    @Column(nullable = false,length = 100)
    private String name;
    // ранг региона (0 - РФ, 1 - область, 2 - город)
    @Column(nullable = false)
    private int rank;
    // родительский регион
    @ManyToOne
    @JoinColumn(name= "parent_region_id")
    private Region parent;
    /*@OneToMany(mappedBy = "parent")
    private List<Region> children;*/

}
