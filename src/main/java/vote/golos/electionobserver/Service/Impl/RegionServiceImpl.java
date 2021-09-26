package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import vote.golos.electionobserver.Entities.Observer;
import vote.golos.electionobserver.Entities.Region;
import vote.golos.electionobserver.Repos.RegionRepos;
import vote.golos.electionobserver.Service.Interface.RegionServiceInterface;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class RegionServiceImpl implements RegionServiceInterface {
    @Autowired
    RegionRepos repos;

    @Override
    public List<Region> getAll() {
        return repos.findAll();
    }

    @Override
    public Region addRegion(Region region) {
        return repos.saveAndFlush(region);
    }

    public List<Region> getRegions(){
        return repos.findByRank(1);
    }

    @Override
    public List<Region> getCitiesOfRegion(Region Parent) {
        return repos.findByParent(Parent);
    }

}
