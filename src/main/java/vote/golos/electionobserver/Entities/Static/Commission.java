package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
// Справочник всех избирательных комиссий
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // номер комиссии
    private long number;
    // город (регион) комиссии
    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;
    // адрес комиссии
    @Column(nullable = false, length = 255)
    private String address;
    // наименование комиссии
    @Column(nullable = false, length = 150)
    private String name;
    // вышестоящая комиссия (для УИК)
    @ManyToOne
    @JoinColumn(name = "parent_commission_id")
    private Commission parent;
    // телефон комиссии
    @Column(length = 20)
    private String phone;
    // почтовый ящик комиссии
    @Column
    private String email;

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