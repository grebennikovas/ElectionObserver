package vote.golos.electionobserver.Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@NoArgsConstructor
// Справочник округов
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    // наименование округа
    @Column(length = 250, nullable = false)
    private String name;
    // номер округа
    @Column(nullable = false)
    private int number;
    // регион (город), в котором располагается округ
    @ManyToOne
    @JoinColumn(name = "region_id",nullable = false)
    private Region region;
    //@ManyToOne
    //@JoinColumn
    //private Campaign campaign;
}
