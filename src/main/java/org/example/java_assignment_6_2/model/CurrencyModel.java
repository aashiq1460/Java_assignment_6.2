
package org.example.java_assignment_6_2.model;

import java.util.ArrayList;

public class CurrencyModel {

    private ArrayList<Currency> currencies = new ArrayList<>();

    public void addCurrency(Currency currency) {
        currencies.add(currency);
    }

    public ArrayList<Currency> getCurrencies() {
        return currencies;
    }
}
