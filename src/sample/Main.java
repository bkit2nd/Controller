package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

        Stage stage = new Stage();
        ArrayList<Internal> internals = FileConstructor.readFormFile();

        public void start(Stage primaryStage) throws Exception {
            VBox root = new VBox();
            Scene scene = new Scene(root, 600, 600);
            stage.setTitle("Internals");
            stage.setScene(scene);
            stage.show();
            addingLayout();
        }
public void addingLayout() {
    GridPane root = new GridPane();

    Text textGrade = new Text("Average grade  " + Internals.getAverageOfGrades(internals));
    root.add(textGrade, 0, 0);
    Text textPoints = new Text("Average grade  " + Internals.getAveragePoints(internals));
    root.add(textPoints, 0, 7);
    Text textMax = new Text("Average grade  " + Internals.getHighestPoints(internals));
    root.add(textMax, 0, 8);



    stage.getScene().setRoot(root);
        }


    public static void main(String[] args) {
        launch(args);
    }
}
