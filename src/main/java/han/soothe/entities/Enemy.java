package han.soothe.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;

import java.util.Objects;

public class Enemy extends Entity implements Collider, SceneBorderCrossingWatcher, SceneBorderTouchingWatcher {

    private double speed = 3;

    public Enemy(String sprite, Coordinate2D initialLocation, int frames, int autoCycle) {
        super(
                sprite,
                initialLocation,
                frames,
                autoCycle,
                new Size(200, 100)
        );
        setMotion(this.speed, 270d);
    }

    //region Physics
    @Override
    public void notifyBoundaryCrossing(SceneBorder border) {
        setAnchorLocationX(getSceneWidth());
        setAnchorLocationY(500);
        this.speed += .5;
        setMotion(this.speed, 270d);
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border) {
        if (Objects.requireNonNull(border) == SceneBorder.BOTTOM) {
            setAnchorLocationY(getSceneHeight() - getHeight());
        }
    }

    //endregion
}
