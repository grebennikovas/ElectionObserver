package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Static.Vote;

import java.util.List;
import java.util.Optional;

public interface CampaignServiceInterface {
    public List<Vote> getAll();
    public Optional<Vote> getCampaign(long id);
    public Vote addCampaign(Vote vote);
}
