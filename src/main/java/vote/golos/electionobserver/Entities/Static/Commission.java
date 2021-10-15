package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
// Справочник всех участков
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // номер участка
    private long number;
    // город (регион) участка
    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;
    // адрес участка
    @Column(nullable = false, length = 255)
    private String address;
    // наименование участка
    @Column(nullable = false, length = 150)
    private String name;
    // вышестоящая комиссия (для УИК)
    @ManyToOne
    @JoinColumn(name = "parent_commission_id")
    private Commission parent;

    public Commission(long number, Region region, String address, String name, Commission parent) {
        this.number = number;
        this.region = region;
        this.address = address;
        this.name = name;
        this.parent = parent;
    }

    public Commission() {

    }
}