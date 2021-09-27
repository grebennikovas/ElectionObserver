package vote.golos.electionobserver.Entities;

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
    @Column(name = "campaign_id")
    private Long id;
    @Column(nullable = false)
    private Date start_date;
    @Column(nullable = false)
    private Date end_date;
    @Column(nullable = false, length = 150)
    private String name;
    @Column(nullable = false, length = 150,name = "short_name")
    private String ShortName;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
