package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Static.Vote;
import vote.golos.electionobserver.Repos.VoteRepos;
import vote.golos.electionobserver.Service.Interface.Crudable;

import java.util.List;
import java.util.Optional;

@Service
public class VoteService implements Crudable<Vote,Long> {
    @Autowired
    VoteRepos repos;

    @Override
    public Vote add(Vote value) {
        return repos.saveAndFlush(value);
    }

    @Override
    public Optional<Vote> findById(Long id) {
        return repos.findById(id);
    }

    @Override
    public List<Vote> findAll() {
        return repos.findAll();
    }
}
