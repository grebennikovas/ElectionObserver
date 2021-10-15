package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@NoArgsConstructor
// сравочник партий
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    // Наменование партии
    @Column(nullable = false, length = 150)
    private String name;
    // кор. наименование партии
    @Column(nullable = false, length = 150, name = "short_name")
    private String shortName;

    public Party(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }



}
