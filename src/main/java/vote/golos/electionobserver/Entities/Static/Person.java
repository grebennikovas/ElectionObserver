package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@ToString
// справочник наблюдателей
// TO DO: добавить роль
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    // имя
    @Column(nullable = false,length = 100)
    private String f_name;
    // фамилия
    @Column(nullable = false,length = 100)
    private String l_name;
    // отчество
    @Column(length = 100)
    private String m_name;
    // телефон
    @Column(nullable = false,length = 12)
    private String phone;
    // дата рождения
    @Column(nullable = false)
    private Date birth;
    // образование
    private String education;
    // род деятельности
    private String activity;
    // комиссия, к которой прикреплен
    // private String commission;
    // Регион (город) проживания
    @ManyToOne
    @JoinColumn(name="region_id",nullable = false)
    private Region region;

    public Person(String f_name, String l_name, String m_name, String phone, Date birth, String education, String activity, String commission, Region region) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.m_name = m_name;
        this.phone = phone;
        this.birth = birth;
        this.education = education;
        this.activity = activity;
        this.region = region;
    }

    public Person() {

    }
}
