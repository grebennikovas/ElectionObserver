package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@ToString
@NoArgsConstructor
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

}
