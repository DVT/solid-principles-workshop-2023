package za.co.dvt.grads.solid.principles.interfacesegregation;

import java.util.ArrayList;
import java.util.List;

public class GameWorld {

    private List<GameEntity> gameEntities = new ArrayList<>();

    public GameWorld() {
        this.gameEntities.add(new Player());
        this.gameEntities.add(new Wood());
        this.gameEntities.add(new Wood());

        for (GameEntity gameEntity : gameEntities) {
            gameEntity.grow();
            gameEntity.run();
            gameEntity.attack();
        }
    }
}
