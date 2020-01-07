import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Passanger>queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Passanger>();
    }


    public String getName() {
        return this.name;
    }

    public int countPassenger() {
        return this.queue.size();
    }

    public void addPassenger(Passanger passanger) {
        this.queue.add(passanger);
    }

    public Passanger removePassanger() {
        return this.queue.remove(0);
    }
}
