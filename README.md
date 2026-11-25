
# Assignment 6.2 – Currency Converter

A simple JavaFX currency converter using the MVC design pattern.

## Features

- Convert between USD, EUR, GBP, JPY and SEK.
- Select source and target currencies using choice boxes.
- Display the converted amount with two decimal places.
- Handle invalid, empty and negative inputs with error messages.
- Use CSS for readable fonts and styling.

The application uses hardcoded example exchange rates, not live rates.

## How to run

Open the Maven project in IntelliJ IDEA using JDK 25 and run `HelloApplication.java`.

## How to use

1. Enter an amount.
2. Select the source and target currencies.
3. Click **Convert**.
4. Read the converted amount in the result field.

## MVC structure

- **Model:** `Currency.java` and `CurrencyModel.java` store currency information.
- **View:** `CurrencyView.java` creates the user interface using VBox and HBox layouts.
- **Controller:** `CurrencyController.java` calculates conversions and handles invalid input.
- **Application:** `HelloApplication.java` connects the components.
- **CSS:** `style.css` controls the appearance of the UI.

## Completed assignment requirements

1. The UI contains all required components.
2. The components are organized using appropriate layouts.
3. The application follows the MVC pattern.
4. The application calculates and displays currency conversions correctly using the stored rates.
5. The application handles errors and invalid input gracefully.
6. The application provides clear instructions for the user.

**Completed items: 1, 2, 3, 4, 5 and 6.**

The application was tested with valid and invalid inputs.
