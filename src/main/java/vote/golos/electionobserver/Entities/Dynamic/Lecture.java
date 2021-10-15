package vote.golos.electionobserver.Entities.Dynamic;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import vote.golos.electionobserver.Entities.Static.Observer;
import vote.golos.electionobserver.Entities.Static.Region;
import vote.golos.electionobserver.Entities.Static.Theme;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@ToString
@NoArgsConstructor
// Занятие с наблюдателями
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // тема занятия
    @ManyToOne
    @JoinColumn(name="theme_id", nullable = false)
    private Theme theme;
    // лектор
    @ManyToOne
    @JoinColumn(name="reader", nullable = false)
    private Observer reader;
    // город лекции
    @ManyToOne
    @JoinColumn(name="region_id", nullable = false)
    private Region region;
    // наименование
    @Column(nullable = false)
    private String name;
    // датавремя начала
    @Column(nullable = false)
    private Timestamp beginning;
    // адрес и аудитория занятия
    @Column(nullable = false)
    private String address;
}
