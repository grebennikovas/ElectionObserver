package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.District;
import vote.golos.electionobserver.Repos.DistrictRepos;
import vote.golos.electionobserver.Service.Interface.DistrictServiceInterface;

import java.util.List;
import java.util.Optional;

@Service
public class DistrictServiceImpl implements DistrictServiceInterface {
    @Autowired
    DistrictRepos repos;
    @Override
    public List<District> getAll() {
        return repos.findAll();
    }

    @Override
    public Optional<District> getDistrict(long id) {
        return repos.findById(id);
    }

    @Override
    public District addDistrict(District district) {
        return repos.saveAndFlush(district);
    }
}
