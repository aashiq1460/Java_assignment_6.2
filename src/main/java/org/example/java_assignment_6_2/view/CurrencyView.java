
package org.example.java_assignment_6_2.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import org.example.java_assignment_6_2.model.Currency;

public class CurrencyView {

    private TextField amountField = new TextField();
    private TextField resultField = new TextField();

    private ChoiceBox<Currency> fromCurrency = new ChoiceBox<>();
    private ChoiceBox<Currency> toCurrency = new ChoiceBox<>();

    private Button convertButton = new Button("Convert");
    private Label errorLabel = new Label();

    private VBox layout = new VBox(10);

    public CurrencyView() {

        Label title = new Label("Currency Converter");
        title.getStyleClass().add("title");

        Label instructions = new Label(
                "Enter an amount, select currencies and click Convert."
        );
        instructions.setWrapText(true);

        Label amountLabel = new Label("Amount");
        amountField.setPromptText("Enter amount");

        VBox fromBox = new VBox(5,
                new Label("From currency"), fromCurrency);

        VBox toBox = new VBox(5,
                new Label("To currency"), toCurrency);

        fromCurrency.setPrefWidth(200);
        toCurrency.setPrefWidth(200);

        HBox currencyBox = new HBox(10, fromBox, toBox);

        Label resultLabel = new Label("Converted amount");
        resultField.setEditable(false);

        convertButton.setMaxWidth(Double.MAX_VALUE);

        errorLabel.getStyleClass().add("error");

        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER_LEFT);

        layout.getChildren().addAll(
                title,
                instructions,
                amountLabel,
                amountField,
                currencyBox,
                convertButton,
                resultLabel,
                resultField,
                errorLabel
        );
    }

    public VBox getLayout() {
        return layout;
    }

    public TextField getAmountField() {
        return amountField;
    }

    public TextField getResultField() {
        return resultField;
    }

    public ChoiceBox<Currency> getFromCurrency() {
        return fromCurrency;
    }

    public ChoiceBox<Currency> getToCurrency() {
        return toCurrency;
    }

    public Button getConvertButton() {
        return convertButton;
    }

    public Label getErrorLabel() {
        return errorLabel;
    }
}
