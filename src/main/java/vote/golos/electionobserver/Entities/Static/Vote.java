package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@ToString
// Справочник голосований
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    // первый день голосования
    @Column(nullable = false)
    private Date start_date;
    // последний день голосования
    @Column(nullable = false)
    private Date end_date;
    // наименование голосования
    @Column(nullable = false, length = 150)
    private String name;
    // короткое наименование голосования
    @Column(nullable = false, length = 150,name = "short_name")
    private String ShortName;
    // регон, в котором проходит голосование
    @ManyToOne
    @JoinColumn(name = "region_id",nullable = false)
    private Region region;
}
