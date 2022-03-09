package com.estacio.programacaoII;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        UIDrawer drawer = new UIDrawer();
        InputHandler inputHandler = new InputHandler();
        Calculator calculator = new Calculator();

        drawer.displayAvailableOperations();
	    int operationIdentifier = inputHandler.captureSelectedOperation();

	    if (operationIdentifier != -1) {
            drawer.askForFirstInputValue();
            float firstValue = inputHandler.captureInput();
            drawer.askForSecondInputValue();
            float secondValue = inputHandler.captureInput();
            float result = calculator.calculate(operationIdentifier, firstValue, secondValue);

            drawer.displayResult(result);
        }

    }
}
