package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Candidate;
import vote.golos.electionobserver.Entities.District;

import java.util.List;
import java.util.Optional;

public interface DistrictServiceInterface {
    public List<District> getAll();
    public Optional<District> getDistrict(long id);
    public District addDistrict(District district);
}
