package za.co.dvt.grads.solid.principles.interfacesegregation;

public class Player implements GameEntity {

    @Override
    public void grow() {
        System.out.println("Player is growing");
    }

    @Override
    public void attack() {
        System.out.println("Player is attacking");
    }

    @Override
    public void run() {
        System.out.println("Player is running");
    }
}
