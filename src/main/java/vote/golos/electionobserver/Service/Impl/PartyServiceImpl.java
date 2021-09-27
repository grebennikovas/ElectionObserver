package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Party;
import vote.golos.electionobserver.Repos.PartyRepos;
import vote.golos.electionobserver.Service.Interface.PartyServiceInterface;

import java.util.List;
import java.util.Optional;
@Service
public class PartyServiceImpl implements PartyServiceInterface {
    @Autowired
    PartyRepos repos;
    @Override
    public List<Party> getAll() {
        return repos.findAll();
    }

    @Override
    public Optional<Party> getParty(long id) {
        return repos.findById(id);
    }

    @Override
    public Party addParty(Party party) {
        return repos.saveAndFlush(party);
    }
}
