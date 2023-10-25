package han.soothe.entities;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Entity extends DynamicSpriteEntity {
    protected Entity(String sprite, Coordinate2D initialLocation, int frames, int autoCycle, Size size) {
        super(sprite, initialLocation, 
                size, 
                1, frames);
        setAutoCycle(autoCycle);
    }
}
