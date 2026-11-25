
package org.example.java_assignment_6_2.controller;

import org.example.java_assignment_6_2.model.Currency;
import org.example.java_assignment_6_2.model.CurrencyModel;
import org.example.java_assignment_6_2.view.CurrencyView;

public class CurrencyController {

    private CurrencyModel model;
    private CurrencyView view;

    public CurrencyController(CurrencyModel model, CurrencyView view) {
        this.model = model;
        this.view = view;

        // Add currencies with example exchange rates
        model.addCurrency(new Currency("USD", "US Dollar", 1.0));
        model.addCurrency(new Currency("EUR", "Euro", 0.92));
        model.addCurrency(new Currency("GBP", "British Pound", 0.79));
        model.addCurrency(new Currency("JPY", "Japanese Yen", 150.0));
        model.addCurrency(new Currency("SEK", "Swedish Krona", 10.4));

        // Add currencies to the choice boxes
        view.getFromCurrency().getItems().addAll(model.getCurrencies());
        view.getToCurrency().getItems().addAll(model.getCurrencies());

        // Select default currencies
        view.getFromCurrency().getSelectionModel().select(0);
        view.getToCurrency().getSelectionModel().select(1);

        // Convert button event
        view.getConvertButton().setOnAction(event -> convert());
    }

    private void convert() {

        view.getErrorLabel().setText("");
        view.getResultField().clear();

        try {
            double amount = Double.parseDouble(
                    view.getAmountField().getText().replace(',', '.'));

            if (amount < 0 || !Double.isFinite(amount)) {
                view.getErrorLabel().setText("Enter a valid positive amount.");
                return;
            }

            Currency from = view.getFromCurrency().getValue();
            Currency to = view.getToCurrency().getValue();

            if (from == null || to == null) {
                view.getErrorLabel().setText("Please select both currencies.");
                return;
            }

            double result = amount / from.getRate() * to.getRate();

            if (!Double.isFinite(result)) {
                view.getErrorLabel().setText("Amount is too large.");
                return;
            }

            view.getResultField().setText(String.format("%.2f", result));

        } catch (NumberFormatException e) {
            view.getErrorLabel().setText("Please enter a valid number.");
        }
    }
}
