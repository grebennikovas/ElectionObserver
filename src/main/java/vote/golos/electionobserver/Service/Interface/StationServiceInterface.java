package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Region;
import vote.golos.electionobserver.Entities.Station;

import java.util.List;

public interface StationServiceInterface {
    Station addStation(Station station);
    List<Station> getStationByParent(Station parent);
}
