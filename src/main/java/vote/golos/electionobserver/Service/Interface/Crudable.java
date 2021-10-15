package vote.golos.electionobserver.Service.Interface;

import java.util.List;
import java.util.Optional;

public interface Crudable<Class,IdType> {
    Class add(Class value);
    Optional<Class> findById(IdType id);
    List<Class> findAll();
}
