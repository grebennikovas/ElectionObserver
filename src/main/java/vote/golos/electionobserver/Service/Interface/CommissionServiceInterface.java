package vote.golos.electionobserver.Service.Interface;

import vote.golos.electionobserver.Entities.Static.Commission;

import java.util.List;

public interface CommissionServiceInterface {
    Commission addStation(Commission commission);
    List<Commission> getStationByParent(Commission parent);
    List<Commission> getStation();
}
