package za.co.dvt.grads.solid.principles.interfacesegregation;

public class Wood implements GameEntity {
    @Override
    public void grow() {
        System.out.println("Wood is growing");
    }

    @Override
    public void attack() {
        System.out.println("A tree cannot attack");
    }

    @Override
    public void run() {
        System.out.println("A tree cannot run");
    }
}
