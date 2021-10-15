package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Static.Party;
import vote.golos.electionobserver.Repos.PartyRepos;
import vote.golos.electionobserver.Service.Interface.Crudable;
import vote.golos.electionobserver.Service.Interface.PartyServiceInterface;

import java.util.List;
import java.util.Optional;
@Service
public class PartyService implements Crudable<Party,Long> {
    @Autowired
    PartyRepos repos;

    @Override
    public Party add(Party value) {
        return repos.saveAndFlush(value);
    }

    @Override
    public Optional<Party> findById(Long id) {
        return repos.findById(id);
    }

    @Override
    public List<Party> findAll() {
        return repos.findAll();
    }
}
