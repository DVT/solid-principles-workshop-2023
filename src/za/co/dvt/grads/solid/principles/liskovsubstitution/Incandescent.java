package za.co.dvt.grads.solid.principles.liskovsubstitution;

public class Incandescent {

    public void printName() {
        System.out.println("I am an incandescent light bulb");
    }

    public void switchOn() {
        System.out.println("Incandescent is now ON");
    }

    public void switchOff() {
        System.out.println("Incandescent is now OFF");
    }
}
