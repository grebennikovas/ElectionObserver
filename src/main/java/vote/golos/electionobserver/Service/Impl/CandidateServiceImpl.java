package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Candidate;
import vote.golos.electionobserver.Repos.CandidateRepos;
import vote.golos.electionobserver.Service.Interface.CandidateServiceInterface;

import java.util.List;
import java.util.Optional;
@Service
public class CandidateServiceImpl implements CandidateServiceInterface {
    @Autowired
    CandidateRepos repos;
    @Override
    public List<Candidate> getAll() {
        return repos.findAll();
    }

    @Override
    public Optional<Candidate> getCandidate(long id) {
        return repos.findById(id);
    }

    @Override
    public Candidate addCandidate(Candidate candidate) {
        return repos.saveAndFlush(candidate);
    }
}
