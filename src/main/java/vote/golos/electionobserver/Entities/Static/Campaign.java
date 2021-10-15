package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@ToString
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    // первый день выборов
    @Column(nullable = false)
    private Date start_date;
    // последний день выборов
    @Column(nullable = false)
    private Date end_date;
    // наименование выборов
    @Column(nullable = false, length = 150)
    private String name;
    // короткое наименование выборов
    @Column(nullable = false, length = 150,name = "short_name")
    private String ShortName;
    // регон, в котором проходят выборы
    @ManyToOne
    @JoinColumn(name = "region_id",nullable = false)
    private Region region;
}
