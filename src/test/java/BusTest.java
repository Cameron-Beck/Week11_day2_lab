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

}
