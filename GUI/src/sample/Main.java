/*
Class: CSE 1322L
Section: J01
Term: Summer 2021
Instructor: Joseph Tierno
Name: Andujar Brutus
Lab#: 8
*/


package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Color Choices");
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();

        Group group = new Group();
        Canvas canvas = new Canvas(300, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setLineWidth(3);
        group.getChildren().add(canvas);
        Scene scene = new Scene(group);

        int i = 0;

        for (i = 0; i <= 255; i++) {
            gc.setStroke(Color.rgb(i, 0, 0));
            gc.strokeLine(10, i, 50, i);
        }

        for (i = 0; i <= 255; i++) {
            gc.setStroke(Color.rgb(0, i, 0));
            gc.strokeLine(60, i, 100, i);
        }

        for (i = 0; i <= 255; i++) {
            gc.setStroke(Color.rgb(0, 0, i));
            gc.strokeLine(110, i, 150, i);
        }

        for (i = 0; i <= 255; i++) {
            gc.setStroke(Color.rgb(i, 0, i));
            gc.strokeLine(160, i, 200, i);
        }

        for (i = 0; i <= 255; i++) {
            gc.setStroke(Color.rgb(i, i, i));
            gc.strokeLine(210, i, 250, i);
        }

        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


}
