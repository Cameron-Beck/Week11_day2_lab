import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Bus bus;
    private Passanger passanger;

    @Before
    public void before(){
        busStop = new BusStop("Leith Walk");
        passanger = new Passanger();
    }

    @Test
    public void getName(){
        assertEquals("Leith Walk", busStop.getName());
    }

    @Test
    public void checkEmpty(){
        assertEquals(0, busStop.countPassenger());
    }

    @Test
    public void addToQueue(){
        busStop.addPassenger(passanger);
        assertEquals(1, busStop.countPassenger());
    }

    @Test
    public void removeFromQueue(){
        busStop.addPassenger(passanger);
        busStop.removePassanger();
        assertEquals(0, busStop.countPassenger());
    }
}
