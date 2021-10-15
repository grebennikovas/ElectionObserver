package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
@NoArgsConstructor
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    // ФИО кандидата
    @Column(nullable = false, length = 255)
    private String name;

    public Candidate(String name) {
        this.name = name;
    }
}
