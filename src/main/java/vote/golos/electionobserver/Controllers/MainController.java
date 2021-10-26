package vote.golos.electionobserver.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vote.golos.electionobserver.Entities.Dynamic.Lead;
import vote.golos.electionobserver.Entities.Dynamic.Observer;
import vote.golos.electionobserver.Entities.Dynamic.Sheet;
import vote.golos.electionobserver.Entities.Static.*;
//import vote.golos.electionobserver.Service.Interface.*;
import vote.golos.electionobserver.Service.CoordinatorService;
import vote.golos.electionobserver.dto.Response;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    CoordinatorService coordinatorService;

    // Полчить всех подчиненных координатора
    @RequestMapping(value="/coordinator/{coord_id}/lead", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Lead>>> getLeads(@PathVariable long coord_id){
        return new ResponseEntity<>(new Response<>("",coordinatorService.getMyLeads(coord_id)), HttpStatus.OK);
    }

    // Вернуть человека по id
    @RequestMapping(value="/coordinator/{coord_id}/person/{person_id}", method = RequestMethod.GET)
    public ResponseEntity<Response<Optional<Person>>> getPerson(@PathVariable long person_id){
        return new ResponseEntity<>(new Response<>("",coordinatorService.getPerson(person_id)), HttpStatus.OK);
    }

    // Получить все назначения координатора
    @RequestMapping(value="/coordinator/{coord_id}/observer", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Observer>>> getObservers(@PathVariable long coord_id){
        return new ResponseEntity<>(new Response<>("",coordinatorService.getMyAppointments(coord_id)), HttpStatus.OK);
    }

    // Связать координатора с участником
    @RequestMapping(value="/coordinator/{coord_id}/lead", method = RequestMethod.POST)
    public ResponseEntity<Response<Lead>> connectWithCoordinator(@PathVariable long coord_id,@RequestBody Lead bodyLead){
        if (coord_id == bodyLead.getCoordinator().getId()){
            Person coord = new Person();
            coord.setId(bodyLead.getCoordinator().getId());
            Person person = new Person();
            person.setId(bodyLead.getPerson().getId());
            return new ResponseEntity<>(new Response<>("",coordinatorService.connectWithMe(coord,person)), HttpStatus.OK);
        }
        else{
            // Если один координатор пытается соединить участника с другим координатором
            return new ResponseEntity<>(new Response<>("",null), HttpStatus.FORBIDDEN);
        }

    }
    // Добавить участника
    @RequestMapping(value="/coordinator/{coord_id}/person", method = RequestMethod.POST)
    public ResponseEntity<Response<Person>> addPerson(@PathVariable long coord_id,@RequestBody Person bodyPerson){
        Person savedPerson = coordinatorService.addPerson(bodyPerson);
        Person coordinator = new Person();
        coordinator.setId(coord_id);
        coordinatorService.connectWithMe(coordinator,savedPerson);
        return new ResponseEntity<>(new Response<>("",savedPerson), HttpStatus.OK);
    }
    // Добавить анкету
    @RequestMapping(value="/coordinator/{coord_id}/person/{person_id}/sheet", method = RequestMethod.POST)
    public ResponseEntity<Response<Sheet>> addSheet(@PathVariable long person_id,@RequestBody Sheet bodySheet){
        if (person_id == bodySheet.getPerson().getId()){
            return new ResponseEntity<>(new Response<>("",coordinatorService.addSheet(bodySheet)), HttpStatus.OK);
        }
        else{
            // Если по клику на участника пытаются добавить анкету другого участника
            return new ResponseEntity<>(new Response<>("",null), HttpStatus.FORBIDDEN);
        }
    }
    // Назначит наблюдателя на участок
    @RequestMapping(value="/coordinator/{coord_id}/observer", method = RequestMethod.POST)
    public ResponseEntity<Response<Observer>> addObserver(@PathVariable long coord_id,@RequestBody Observer bodyObserver){
        return new ResponseEntity<>(new Response<>("",coordinatorService.makeAppoint(bodyObserver)), HttpStatus.OK);

    }
    /*@RequestMapping(value="/station/{station_id}/station", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Commission>>> getStationByParent(@PathVariable long station_id){
        Commission s = new Commission();
        s.setId(station_id);
        return new ResponseEntity<>(new Response<>("",stations.getStationByParent(s)), HttpStatus.OK);
    }
    @RequestMapping(value="/campaign", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Vote>>> getCampaigns(){
        return new ResponseEntity<>(new Response<>("",campaigns.getAll()), HttpStatus.OK);
    }
    @RequestMapping(value="/campaign/{campaign_id}", method = RequestMethod.GET)
    public ResponseEntity<Response<Optional<Vote>>> getCampaignById(@PathVariable long campaign_id){
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
    }*/
}
