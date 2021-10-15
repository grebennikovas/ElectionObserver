package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Static.Campaign;
import vote.golos.electionobserver.Repos.CampaignRepos;
import vote.golos.electionobserver.Service.Interface.CampaignServiceInterface;

import java.util.List;
import java.util.Optional;

@Service
public class CampaignServiceImpl implements CampaignServiceInterface {
    @Autowired
    CampaignRepos repos;
    @Override
    public List<Campaign> getAll() {
        return repos.findAll();
    }

    @Override
    public Optional<Campaign> getCampaign(long id) {
        return repos.findById(id);
    }

    @Override
    public Campaign addCampaign(Campaign campaign) {
        return repos.saveAndFlush(campaign);
    }
}
