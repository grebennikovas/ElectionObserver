package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Static.Region;

import java.util.List;

public interface RegionServiceInterface {
    List<Region> getAll();
    Region addRegion(Region region);
    List<Region> getRegions();
    List<Region> getCitiesOfRegion(Region Parent);
}
