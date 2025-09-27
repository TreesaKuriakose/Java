import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorSwitcher extends Application {

    private final Color color1 = Color.RED;
    private final Color color2 = Color.BLUE;

    private final StringProperty currentColorName = new SimpleStringProperty("RED");

    @Override
    public void start(Stage stage) {
        Rectangle rect = new Rectangle(150, 100, color1);

        ToggleButton toggle = new ToggleButton("Switch Color");
        Label label = new Label();
        label.textProperty().bind(currentColorName);  // ✅ binding

        toggle.setOnAction(e -> {
            if (rect.getFill().equals(color1)) {
                rect.setFill(color2);
                currentColorName.set("BLUE");
            } else {
                rect.setFill(color1);
                currentColorName.set("RED");
            }
        });

        VBox root = new VBox(15, rect, toggle, label);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        stage.setScene(new Scene(root, 300, 250));
        stage.setTitle("Color Switcher");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
