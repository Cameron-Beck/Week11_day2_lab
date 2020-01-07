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
}
