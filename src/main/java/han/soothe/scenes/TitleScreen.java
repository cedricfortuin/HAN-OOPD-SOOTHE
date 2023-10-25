package han.soothe.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import han.soothe.Soothe;
import han.soothe.entities.buttons.StartGameButton;
import han.soothe.entities.headers.MainHeader;

public class TitleScreen extends StaticScene {

    private final Soothe soothe;

    public TitleScreen(Soothe soothe) {
        this.soothe = soothe;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("wallpapers/titlescreen-wallpaper.png");
    }

    @Override
    public void setupEntities() {
        TextEntity headerText = new MainHeader(
                new Coordinate2D(getWidth() / 2, getHeight() / 2 - 250),
                "Soothe"
        );
        headerText.setAnchorPoint(AnchorPoint.TOP_CENTER);
        addEntity(headerText);

        StartGameButton startGameButton = new StartGameButton(
                new Coordinate2D(getWidth() / 2, getHeight() / 2 + 50),
                "Start game",
                this.soothe
        );
        startGameButton.setAnchorPoint(AnchorPoint.BOTTOM_CENTER);
        addEntity(startGameButton);
    }
}
