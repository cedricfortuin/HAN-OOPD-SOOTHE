package han.soothe.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Soothe extends Entity implements Newtonian, KeyListener, SceneBorderTouchingWatcher, Collided {
    private boolean spacePressed = false;
    private final han.soothe.Soothe soothe;

    public Soothe(Coordinate2D initialLocation, han.soothe.Soothe soothe) {
        super(
                "sprites/cat/Walk.png",
                initialLocation,
                6,
                200,
                new Size(100, 100)
        );
        this.soothe = soothe;
    }

    //region Physics
    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        if (pressedKeys.contains(KeyCode.SPACE) && !this.spacePressed) {
            setMotion(8, 180d);
            this.spacePressed = true;
        } else if (!pressedKeys.contains(KeyCode.SPACE)) {
            this.spacePressed = false;
        }
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        this.soothe.setActiveScene(500);
    }
    //endregion

    //region Frame
    @Override
    public void notifyBoundaryTouching(SceneBorder border) {
        setSpeed(0);
        if (Objects.requireNonNull(border) == SceneBorder.BOTTOM) {
            setAnchorLocationY(getSceneHeight() - getHeight());
        }
    }
    //endregion
}
