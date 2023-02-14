package za.co.dvt.grads.solid.principles.interfacesegregation;

public interface GameEntity {
    /**
     * Increases the size of the game entity.
     */
    void grow();

    /**
     * Makes the game entity perform an attack.
     */
    void attack();

    /**
     * Makes the game entity run.
     */
    void run();
}
