package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
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

    public Region(String name, Region parent) {
        this.name = name;
        this.parent = parent;
        this.rank = parent.rank + 1;
    }

    public Region() {
    }

}