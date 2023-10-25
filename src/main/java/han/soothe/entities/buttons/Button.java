package han.soothe.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;

public class Button extends TextEntity {
    public Button(Coordinate2D initialLocation, String textContent, Color color, int textSize, FontWeight fontWeight) {
        super(initialLocation, textContent);
        setFill(color);
        setFont(Font.font("Roboto", fontWeight, textSize));
    }
}
