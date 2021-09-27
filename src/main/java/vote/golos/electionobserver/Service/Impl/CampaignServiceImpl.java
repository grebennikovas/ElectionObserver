package vote.golos.electionobserver.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vote.golos.electionobserver.Entities.Campaign;
import vote.golos.electionobserver.Repos.CampaignRepos;
import vote.golos.electionobserver.Service.Interface.CampaignServiceInterface;

import java.util.List;

@Service
public class CampaignServiceImpl implements CampaignServiceInterface {
    @Autowired
    CampaignRepos repos;
    @Override
    public List<Campaign> getAll() {
        return repos.findAll();
    }

    @Override
    public Campaign getCampaign(long id) {
        return repos.getById(id);
    }

    @Override
    public Campaign addCampaign(Campaign campaign) {
        return repos.saveAndFlush(campaign);
    }
}
