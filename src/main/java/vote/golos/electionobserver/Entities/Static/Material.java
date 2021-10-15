package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@ToString
// Справочник видов общего результата по участку
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    // наименование вида общего результата
    @Column(nullable = false)
    private String name;
    // тема материала
    @ManyToOne
    @JoinColumn(name = "theme_id")
    private Theme theme;
    // содержание
    @Column
    String body;
    @Column
    Date date;
}
