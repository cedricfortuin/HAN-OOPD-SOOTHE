package han.soothe.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import han.soothe.entities.Soothe;
import han.soothe.entities.Enemy;

public class GameField extends DynamicScene {

    private final han.soothe.Soothe soothe;

    public GameField(han.soothe.Soothe soothe) {
        this.soothe = soothe;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("wallpapers/gamescreen-wallpaper-Stray.jpg");
    }

    @Override
    public void setupEntities() {
        Soothe soothe = new Soothe(
                new Coordinate2D(getWidth() / 2 - 200, 560),
                this.soothe
        );
        addEntity(soothe);

        Enemy enemy = new Enemy(
                "sprites/dog/Walk-dog-blue.png",
                new Coordinate2D(getWidth(), 560),
                6,
                100
        );
        addEntity(enemy);
    }
}
