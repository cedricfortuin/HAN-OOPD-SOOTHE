package han.soothe;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;

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

    }
}
