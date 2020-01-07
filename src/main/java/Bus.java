import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Passanger> passangerList;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passangerList = new ArrayList<Passanger>();
    }


    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countPassangers() {
        return this.passangerList.size();
    }


    public void addPassanger(Passanger passanger) {
        if (countPassangers() < capacity){
            this.passangerList.add(passanger);
        }
    }

    public void removePassanger() {
        if (countPassangers() > 0) {
            this.passangerList.remove(0);
        }
    }

    public void addPassangerFromQueue(BusStop busStop) {
        if(busStop.countPassenger() > 0){
            Passanger passangerFromQueue = busStop.removePassanger();
            addPassanger(passangerFromQueue);
        }
    }
}
