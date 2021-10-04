package vote.golos.electionobserver.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vote.golos.electionobserver.Entities.*;
import vote.golos.electionobserver.Service.Interface.*;
import vote.golos.electionobserver.dto.Response;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    ObserverServiceInterface observers;
    @Autowired
    RegionServiceInterface regions;
    @Autowired
    CommissionServiceInterface stations;
    @Autowired
    CampaignServiceInterface campaigns;
    @Autowired
    CandidateServiceInterface candidates;
    @Autowired
    PartyServiceInterface parties;
    @Autowired
    DistrictServiceInterface districts;
    @RequestMapping(value="/observer", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Observer>>> getObservers(){
        return new ResponseEntity<>(new Response<>("",observers.getAll()), HttpStatus.OK);
    }

    @RequestMapping(value="/region", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Region>>> getRegions(){
        return new ResponseEntity<>(new Response<>("",regions.getRegions()), HttpStatus.OK);
    }

    @RequestMapping(value="/region/{region_id}/city", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Region>>> getCitiesByRegion(@PathVariable long region_id){
        Region r = new Region();
        r.setId(region_id);
        return new ResponseEntity<>(new Response<>("",regions.getCitiesOfRegion(r)), HttpStatus.OK);
    }
    @RequestMapping(value="/station", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Commission>>> getStations(){
        return new ResponseEntity<>(new Response<>("",stations.getStation()), HttpStatus.OK);
    }
    @RequestMapping(value="/station/{station_id}/station", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Commission>>> getStationByParent(@PathVariable long station_id){
        Commission s = new Commission();
        s.setId(station_id);
        return new ResponseEntity<>(new Response<>("",stations.getStationByParent(s)), HttpStatus.OK);
    }
    @RequestMapping(value="/campaign", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Campaign>>> getCampaigns(){
        return new ResponseEntity<>(new Response<>("",campaigns.getAll()), HttpStatus.OK);
    }
    @RequestMapping(value="/campaign/{campaign_id}", method = RequestMethod.GET)
    public ResponseEntity<Response<Optional<Campaign>>> getCampaignById(@PathVariable long campaign_id){
        return new ResponseEntity<>(new Response<>("",campaigns.getCampaign(campaign_id)), HttpStatus.OK);
    }
    @RequestMapping(value="/candidate", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Candidate>>> getCandidates(){
        return new ResponseEntity<>(new Response<>("",candidates.getAll()), HttpStatus.OK);
    }
    @RequestMapping(value="/party", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Party>>> getParties(){
        return new ResponseEntity<>(new Response<>("",parties.getAll()), HttpStatus.OK);
    }
    @RequestMapping(value="/district", method = RequestMethod.GET)
    public ResponseEntity<Response<List<District>>> getDistrict(){
        return new ResponseEntity<>(new Response<>("",districts.getAll()), HttpStatus.OK);
    }
}
