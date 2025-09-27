import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFx extends Application{
 private int count = 0;
 public void start(Stage stage){
  Button button = new Button("Click me");
  Label label = new Label("click : 0");

  button.setOnAction(e-> {
   count++;
   label.setText("Clicks"+ count);
  });


 VBox root = new VBox(10,button,label);
 Scene scene = new Scene(root,300,200);
 stage.setScene(scene);
 stage.setTitle("me");
 stage.show();
 }
 public static void main(String[] args){
  launch(args);

 }
}