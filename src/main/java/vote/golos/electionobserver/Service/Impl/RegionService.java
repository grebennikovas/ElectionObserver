package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Static.Region;
import vote.golos.electionobserver.Repos.RegionRepos;
import vote.golos.electionobserver.Service.Interface.Crudable;
import vote.golos.electionobserver.Service.Interface.RegionServiceInterface;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService implements Crudable<Region,Long> {
    @Autowired
    RegionRepos repos;

    @Override
    public Region add(Region value) {
        return repos.saveAndFlush(value);
    }

    @Override
    public Optional<Region> findById(Long id) {
        return repos.findById(id);
    }

    @Override
    public List<Region> findAll() {
        return repos.findAll();
    }

    public List<Region> getRegions(){
        return repos.findByRank(1);
    }

    public List<Region> getCitiesOfRegion(Region Parent) {
        return repos.findByParent(Parent);
    }
}
