package vote.golos.electionobserver.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long number;
    @ManyToOne
    @JoinColumn
    private Region city;
    @Column(nullable = false, length = 150)
    private String address;
    @Column(nullable = false, length = 150)
    private String name;
    @ManyToOne
    @JoinColumn
    private Station parent;

    public Station(long number, Region city, String address, String name, Station parent) {
        this.number = number;
        this.city = city;
        this.address = address;
        this.name = name;
        this.parent = parent;
    }

    public Station() {

    }
}