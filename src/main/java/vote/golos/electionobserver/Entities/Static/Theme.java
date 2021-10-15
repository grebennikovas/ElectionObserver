package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
// Справочник тем для обучения
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    // наименование темы
    @Column(nullable = false)
    private String name;
}
