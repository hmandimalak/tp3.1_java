
package ex2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;

public class PremiereFenetre extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);
        primaryStage.setTitle("Ma première fenêtre");
        primaryStage.setScene(scene);
        Rectangle R1 = new Rectangle(50, 50, 50, 50);
        Line L1 =new Line(200,200,100,150);
        root.getChildren().add(R1);
        root.getChildren().add(L1);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
