package vote.golos.electionobserver.Entities.Static;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "result_type")
@Data
@ToString
// Справочник видов общего результата по участку
public class ResultType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    // наименование вида общего результата
    @Column(nullable = false)
    private String name;
}
