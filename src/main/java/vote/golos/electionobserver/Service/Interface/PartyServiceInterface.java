package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Static.Party;

import java.util.List;
import java.util.Optional;

public interface PartyServiceInterface {
    public List<Party> getAll();
    public Optional<Party> getParty(long id);
    public Party addParty(Party party);
}
