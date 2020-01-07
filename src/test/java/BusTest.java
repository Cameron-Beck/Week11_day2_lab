import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Passanger passanger;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 5);
        passanger = new Passanger();
    }
        @Test
        public void hasDestination(){
            assertEquals("Ocean Terminal", bus.getDestination());
        }
//
        @Test
        public void hasCapacity(){
            assertEquals(5, bus.getCapacity());
        }
//
        @Test
        public void countPassangers(){
        assertEquals(0, bus.countPassangers());
        }

        @Test
        public void addPassangerIFBusNotFull(){
        bus.addPassanger(passanger);
        assertEquals(1, bus.countPassangers());
        }

        @Test
        public void addPassangerIfBusIsFull(){
            bus.addPassanger(passanger);
            bus.addPassanger(passanger);
            bus.addPassanger(passanger);
            bus.addPassanger(passanger);
            bus.addPassanger(passanger);
            bus.addPassanger(passanger);
            assertEquals(5, bus.countPassangers());
        }

        @Test
    public void removePassanger(){
        bus.addPassanger(passanger);
        bus.removePassanger();
        assertEquals(0, bus.countPassangers());
        }

        @Test
        public void removePassangerFromEmptyBus(){
        bus.removePassanger();
        assertEquals(0, bus.countPassangers());
        }

}
