package han.soothe;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import han.soothe.scenes.GameField;
import han.soothe.scenes.GameOverScreen;
import han.soothe.scenes.TitleScreen;

public class Soothe extends YaegerGame {
    public static void main(String[] args) {
        System.out.println("Starting Soothe!");
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Soothe");
        setSize(new Size(800, 600));
    }

    @Override
    public void setupScenes() {
        addScene(0, new TitleScreen(this));
        addScene(1, new GameField(this));
        addScene(500, new GameOverScreen());
    }
}
