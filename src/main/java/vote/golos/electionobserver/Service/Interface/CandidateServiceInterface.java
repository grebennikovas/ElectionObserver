package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Campaign;
import vote.golos.electionobserver.Entities.Candidate;

import java.util.List;
import java.util.Optional;

public interface CandidateServiceInterface {
    public List<Candidate> getAll();
    public Optional<Candidate> getCandidate(long id);
    public Candidate addCandidate(Candidate candidate);
}
