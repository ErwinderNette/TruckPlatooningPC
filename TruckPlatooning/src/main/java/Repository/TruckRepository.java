package Repository;

import Entity.TruckAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TruckRepository  {

    private int id;
    List<TruckAgent> truckAgentList = new ArrayList<>();

    @Autowired
    public void addTruck(){
        TruckAgent truckAgent = new TruckAgent();
        truckAgentList.add(truckAgent);
    }

    @Autowired
    public void getTruckById(){

    }





}

