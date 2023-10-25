package han.soothe.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import han.soothe.Soothe;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;

import java.awt.*;
import java.net.URI;

public class QuitButton extends Button implements MouseButtonPressedListener {
    public QuitButton(Coordinate2D initialLocation, String textContent) {
        super(
                initialLocation,
                textContent,
                Color.AQUA,
                50,
                FontWeight.EXTRA_LIGHT
        );
    }

    @Override
    public void onMouseButtonPressed(MouseButton button, Coordinate2D coordinate2D) {
        for (int i = 0; i < 10; i++) {
            try {
                Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
