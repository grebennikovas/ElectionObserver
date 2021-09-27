package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Campaign;

import java.util.List;

public interface CampaignServiceInterface {
    public List<Campaign> getAll();
    public Campaign getCampaign(long id);
    public Campaign addCampaign(Campaign campaign);
}
