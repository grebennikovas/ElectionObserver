package vote.golos.electionobserver.Entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@ToString
public class Observer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long observer_id;
    private String name;
    private String phone;

    public Observer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Observer() {

    }
}
