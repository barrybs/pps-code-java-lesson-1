package u01run;

public class Device {
/*
    public boolean isOff() {
        return true; //è il più piccolo codice che fa passare i test
    }
*/
    private boolean on;

    public void on() {
        this.on = true;
    }

    public boolean isOn() {
        return this.on;
    }

    public void off() {
        this.on = false;
    }
}
