package han.soothe.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import han.soothe.entities.buttons.QuitButton;
import han.soothe.entities.headers.MainHeader;
import javafx.scene.paint.Color;

import java.awt.Desktop;
import java.net.URI;

public class GameOverScreen extends StaticScene {
    @Override
    public void setupScene() {
        setBackgroundColor(Color.ORANGERED);
    }

    @Override
    public void setupEntities() {
        MainHeader gameOver = new MainHeader(
                new Coordinate2D(getWidth() / 2 - 300, getHeight() / 2 - 250),
                "Game over"
        );
        addEntity(gameOver);

        QuitButton quitButton = new QuitButton(
                new Coordinate2D(getWidth() / 2 - 300, getHeight() / 2 - 50),
                "Don't click me"
        );
        addEntity(quitButton);
    }
}
