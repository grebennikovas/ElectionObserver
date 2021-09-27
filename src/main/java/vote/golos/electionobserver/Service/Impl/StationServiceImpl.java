package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Station;
import vote.golos.electionobserver.Repos.StationRepos;
import vote.golos.electionobserver.Service.Interface.StationServiceInterface;

import javax.persistence.Access;
import java.util.List;
@Service
public class StationServiceImpl implements StationServiceInterface {
    @Autowired
    StationRepos repos;
    @Override
    public Station addStation(Station station) {
        return repos.saveAndFlush(station);
    }

    @Override
    public List<Station> getStationByParent(Station parent) {
        return repos.findByParent(parent);
    }

    @Override
    public List<Station> getStation() {
        return repos.findAllBy();
    }
}
