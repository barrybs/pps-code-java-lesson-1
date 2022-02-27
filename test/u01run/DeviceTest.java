package u01run;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    Device device;

    @BeforeEach
    void setUp() {
        this.device = new Device();
    }

    /*Verifico che il dispositivo sia inizialmente spento*/
    /*
    @Test

    void testIsInitiallyOff(){
        assertTrue(this.device.isOff());
    }
    */

    @Test
    void testIsInitiallyOff(){
        assertFalse(this.device.isOn());
    }

    @Test
    void testCanBeSwitchedOn(){
        this.device.on();
        assertTrue(this.device.isOn());
    }

    @Test
    void testCanBeSwitchedOff(){
        this.device.on();
        this.device.off();
        assertFalse(this.device.isOn());
    }


}