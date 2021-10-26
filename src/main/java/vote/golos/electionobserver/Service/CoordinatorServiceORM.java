package vote.golos.electionobserver.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Dynamic.*;
import vote.golos.electionobserver.Entities.Static.Person;
import vote.golos.electionobserver.Repos.LeadRepos;
import vote.golos.electionobserver.Repos.ObserverRepos;
import vote.golos.electionobserver.Repos.PersonRepos;
import vote.golos.electionobserver.Repos.SheetRepos;

import java.util.List;
import java.util.Optional;

@Service
public class CoordinatorServiceORM implements CoordinatorService{
    @Autowired
    LeadRepos leads;

    @Autowired
    SheetRepos sheets;

    @Autowired
    PersonRepos persons;

    @Autowired
    ObserverRepos observers;


    // Working with Observers

    @Override
    public List<Lead> getMyLeads(long CoordId) {
        return leads.findAllByCoordinatorId(CoordId);
    }

    @Override
    public List<Observer> getMyAppointments(long CoordId) {
        return observers.findAllByLead_Coordinator_Id(CoordId);
    }

    @Override
    public Optional<Person> getPerson(long personId) {
        return persons.findById(personId);
    }

    @Override
    public Observer getObserver(long observerId) {
        return null;
    }

    @Override
    public Person addPerson(Person person) {
        return persons.saveAndFlush(person);
    }

    @Override
    public Sheet addSheet(Sheet sheet) {
        return sheets.saveAndFlush(sheet);
    }

    @Override
    public Lead connectWithMe(Lead lead) {
        return leads.saveAndFlush(lead);
    }

    @Override
    public Lead connectWithMe(Person coord, Person person) {
        Lead lead = new Lead();
        lead.setCoordinator(coord);
        lead.setPerson(person);
        return leads.saveAndFlush(lead);
    }

    @Override
    public Observer makeAppoint(Observer observer) {
        return observers.saveAndFlush(observer);
    }

    // Working with Commissions

    @Override
    public List<CommissionHistory> getMyCommissions(long coordId) {
        return null;
    }

    @Override
    public List<CommonResult> getCommissionCommonHistory(long comissionId) {
        return null;
    }

    @Override
    public List<VoteResult> getCommissionVoteHistory(long comissionId) {
        return null;
    }
}
