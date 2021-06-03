package Entity;



public class TruckAgent {

    private int id;
    private int speed;
    private int frontId;
    private int backId;

    TruckAgent truckAgent = new TruckAgent();

    public void truckAgent(int id, int speed, int frontId, int backId){
        this.id=id;
        this.speed=speed;
        this.frontId=frontId;
        this.backId=backId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFrontId() {
        return frontId;
    }

    public void setFrontId(int frontId) {
        this.frontId = frontId;
    }

    public int getBackId() {
        return backId;
    }

    public void setBackId(int backId) {
        this.backId = backId;
    }

    public TruckAgent getTruckAgent() {
        return truckAgent;
    }

    public void setTruckAgent(TruckAgent truckAgent) {
        this.truckAgent = truckAgent;
    }
}
