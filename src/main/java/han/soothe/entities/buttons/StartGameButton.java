package han.soothe.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import han.soothe.Soothe;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;

public class StartGameButton extends Button implements MouseButtonPressedListener {
    private final Soothe soothe;

    public StartGameButton(Coordinate2D initialLocation, String textContent, Soothe soothe) {
        super(
                initialLocation,
                textContent,
                Color.AQUA,
                50,
                FontWeight.EXTRA_LIGHT
        );
        this.soothe = soothe;
    }

    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {
        this.soothe.setActiveScene(1);
    }
}
