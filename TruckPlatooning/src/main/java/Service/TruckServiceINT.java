package Service;

import Entity.TruckAgent;

import java.util.List;

public interface TruckServiceINT {
    public TruckAgent register();

    List<TruckAgent> getTruck();
}
