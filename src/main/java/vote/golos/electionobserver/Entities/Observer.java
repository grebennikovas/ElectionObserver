package vote.golos.electionobserver.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@ToString
public class Observer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "observer_id")
    private Long id;
    @Column(nullable = false,length = 100)
    private String f_name;
    @Column(nullable = false,length = 100)
    private String l_name;
    @Column(length = 100)
    private String m_name;
    @Column(nullable = false,length = 12)
    private String phone;
    @Column(nullable = false)
    private Date birth;
    private String education;
    private String activity;
    private String commission;
    @ManyToOne
    @JoinColumn
    private Region region;

    public Observer(String f_name, String l_name, String m_name, String phone, Date birth, String education, String activity, String commission,Region region) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.m_name = m_name;
        this.phone = phone;
        this.birth = birth;
        this.education = education;
        this.activity = activity;
        this.commission = commission;
        this.region = region;
    }

    public Observer() {

    }
}
