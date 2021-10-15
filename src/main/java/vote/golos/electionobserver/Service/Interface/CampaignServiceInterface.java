package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Static.Campaign;

import java.util.List;
import java.util.Optional;

public interface CampaignServiceInterface {
    public List<Campaign> getAll();
    public Optional<Campaign> getCampaign(long id);
    public Campaign addCampaign(Campaign campaign);
}
