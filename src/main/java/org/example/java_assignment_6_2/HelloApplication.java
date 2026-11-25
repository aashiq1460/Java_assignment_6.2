
package org.example.java_assignment_6_2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.example.java_assignment_6_2.model.CurrencyModel;
import org.example.java_assignment_6_2.view.CurrencyView;
import org.example.java_assignment_6_2.controller.CurrencyController;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        CurrencyModel model = new CurrencyModel();
        CurrencyView view = new CurrencyView();

        new CurrencyController(model, view);

        Scene scene = new Scene(view.getLayout(), 460, 400);

        scene.getStylesheets().add(
                getClass().getResource("/style.css").toExternalForm()
        );

        stage.setTitle("Currency Converter");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
