package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Static.Candidate;

import java.util.List;
import java.util.Optional;

public interface CandidateServiceInterface {
    public List<Candidate> getAll();
    public Optional<Candidate> getCandidate(long id);
    public Candidate addCandidate(Candidate candidate);
}
