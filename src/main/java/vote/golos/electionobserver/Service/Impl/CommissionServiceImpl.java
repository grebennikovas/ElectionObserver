package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Commission;
import vote.golos.electionobserver.Repos.CommissionRepos;
import vote.golos.electionobserver.Service.Interface.CommissionServiceInterface;

import java.util.List;
@Service
public class CommissionServiceImpl implements CommissionServiceInterface {
    @Autowired
    CommissionRepos repos;
    @Override
    public Commission addStation(Commission commission) {
        return repos.saveAndFlush(commission);
    }

    @Override
    public List<Commission> getStationByParent(Commission parent) {
        return repos.findByParent(parent);
    }

    @Override
    public List<Commission> getStation() {
        return repos.findAllBy();
    }
}
