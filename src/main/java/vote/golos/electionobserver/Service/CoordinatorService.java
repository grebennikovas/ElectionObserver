package vote.golos.electionobserver.Service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import vote.golos.electionobserver.Entities.Dynamic.*;
import vote.golos.electionobserver.Entities.Static.Person;

import java.util.List;
import java.util.Optional;

public interface CoordinatorService {

   // Working with Observers
   List<Lead> getMyLeads(long CoordId);

   List<Observer> getMyAppointments(long CoordId);

   //List<Sheet> getSheets(long CoordId);

   Optional<Person> getPerson(long personId);

   Observer getObserver(long observerId);

   Person addPerson(Person person);

   Sheet addSheet(Sheet sheet);

   Lead connectWithMe(Lead lead);

   Lead connectWithMe(Person coord, Person person);

   Observer makeAppoint(Observer observer);

   // Working with Comissions

   List<CommissionHistory> getMyCommissions(long coordId);

   List<CommonResult> getCommissionCommonHistory(long comissionId);

   List<VoteResult> getCommissionVoteHistory(long comissionId);

}
