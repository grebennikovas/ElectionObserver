package vote.golos.electionobserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response <T> {
    String meta = "";
    T data;
}
