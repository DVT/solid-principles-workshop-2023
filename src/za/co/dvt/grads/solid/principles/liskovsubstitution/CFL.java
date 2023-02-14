package za.co.dvt.grads.solid.principles.liskovsubstitution;

public class CFL {

    public void printName() {
        System.out.println("I am a Compact Fluorescent Lamp (CFL) light bulb");
    }

    public void switchOn() {
        System.out.println("CFL is now ON");
    }

    public void switchOff() {
        System.out.println("CFL is now OFF");
    }
}
