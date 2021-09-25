package vote.golos.electionobserver.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vote.golos.electionobserver.Entities.Observer;
import vote.golos.electionobserver.Entities.Response;
import vote.golos.electionobserver.Service.Interface.ObserverServiceInterface;

import java.util.List;

@RestController
@RequestMapping("api")
public class MainController {
    @Autowired
    ObserverServiceInterface observers;

    @RequestMapping(value="/index", method = RequestMethod.GET)
    public ResponseEntity<Response<String>> getIndex(){
        return new ResponseEntity<>(new Response<>("","first string of project"), HttpStatus.OK);
    }

    @RequestMapping(value="/add", method = RequestMethod.GET)
    public ResponseEntity<Response<Observer>> getAdd(){
        Observer o = observers.addObserver(new Observer("abd","89155540228"));
        return new ResponseEntity<>(new Response<>("",o), HttpStatus.OK);
    }

    @RequestMapping(value="/get", method = RequestMethod.GET)
    public ResponseEntity<Response<List<Observer>>> getAll(){
        return new ResponseEntity<>(new Response<>("",observers.getAll()), HttpStatus.OK);
    }

}
