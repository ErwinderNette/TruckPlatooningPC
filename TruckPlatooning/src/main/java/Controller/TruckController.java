package Controller;

import Entity.TruckAgent;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TruckController {

    TruckAgent truckAgent = new TruckAgent();

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public @ResponseBody String hello(){
        return "hello";
    }

   // @RequestMapping(path= "/accelerate/{amount}", method = RequestMethod.GET)
    //@ResponseBody
    /*public String accelerate(@PathVariable("amount") int amount, int id){
        truckAgent.getTruckById
        //truckAgent#ID1.getSpeed:  oldSpeed+accelerate()
        return "ausgefuhrt";*/
    }
    // stop
    // bremsen


