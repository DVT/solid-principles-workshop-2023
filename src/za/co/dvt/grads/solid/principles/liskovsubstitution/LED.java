package za.co.dvt.grads.solid.principles.liskovsubstitution;

public class LED {

    public void printName() {
        System.out.println("I am a light-emitting diode (LED) light bulb");
    }

    public void switchOn() {
        System.out.println("LED is now ON");
    }

    public void switchOff() {
        System.out.println("LED is now OFF");
    }
}
