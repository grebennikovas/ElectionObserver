package vote.golos.electionobserver.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vote.golos.electionobserver.Entities.Campaign;
import vote.golos.electionobserver.Entities.Observer;
import vote.golos.electionobserver.Entities.Region;
import vote.golos.electionobserver.Entities.Station;
import vote.golos.electionobserver.Service.Interface.CampaignServiceInterface;
import vote.golos.electionobserver.Service.Interface.RegionServiceInterface;
import vote.golos.electionobserver.Service.Interface.StationServiceInterface;
import vote.golos.electionobserver.dto.Response;
import vote.golos.electionobserver.Service.Interface.ObserverServiceInterface;

import java.util.List;

@RestController
@RequestMapping("api")
public class MainController {
    @Autowired
    ObserverServiceInterface observers;
    @Autowired
    RegionServiceInterface regions;
    @Autowired
    StationServiceInterface stations;
    @Autowired
    CampaignServiceInterface campaigns;

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
        r.setRegion_id(region_id);
        return new ResponseEntity<>(new Response<>("",regions.getCitiesOfRegion(r)), HttpStatus.OK);
    }
    @RequestMapping(value="/station", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Station>>> getStations(){
        return new ResponseEntity<>(new Response<>("",stations.getStation()), HttpStatus.OK);
    }
    @RequestMapping(value="/station/{station_id}/station", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Station>>> getStationByParent(@PathVariable long station_id){
        Station s = new Station();
        s.setId(station_id);
        return new ResponseEntity<>(new Response<>("",stations.getStationByParent(s)), HttpStatus.OK);
    }
    @RequestMapping(value="/campaign", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Campaign>>> getCampaigns(){
        return new ResponseEntity<>(new Response<>("",campaigns.getAll()), HttpStatus.OK);
    }
    @RequestMapping(value="/campaign/{campaign_id}", method = RequestMethod.GET)
    public ResponseEntity<Response<Campaign>> getCampaignById(@PathVariable long campaign_id){
        return new ResponseEntity<>(new Response<>("",campaigns.getCampaign(campaign_id)), HttpStatus.OK);
    }

}
