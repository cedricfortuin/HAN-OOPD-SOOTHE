package han.soothe.entities.headers;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MainHeader extends TextEntity {
    public MainHeader(Coordinate2D initialLocation, String content) {
        super(initialLocation, content);
        setFill(Color.ALICEBLUE);
        setFont(Font.font("Roboto", FontWeight.EXTRA_LIGHT, 120));
    }
}
