package sample;

import java.awt.*;
import java.awt.event.ActionEvent;

import javafx.scene.control.Label;

public class Controller {

    public javafx.scene.control.TextField textField2;
    public javafx.scene.control.TextField textField1;
    public Label label;

    public void add(javafx.event.ActionEvent actionEvent) {
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());
        label.setText(" " + (num1 + num2));

    }

    public void clear(javafx.event.ActionEvent actionEvent) {
        label.setText("");
        textField1.setText("");
        textField2.setText("");


    }
}
