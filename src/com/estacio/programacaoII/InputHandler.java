package com.estacio.programacaoII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    private Scanner keyboardReader;

    public InputHandler() {
        this.keyboardReader = new Scanner(System.in);
    }

    public int captureSelectedOperation() {
        int operation = -1;
        try {
            operation = keyboardReader.nextInt();
            if (operation == Operations.SOMAR) {
                return Operations.SOMAR;
            }
            else if (operation == Operations.SUBTRAIR) {
                return Operations.SUBTRAIR;
            }
            else if (operation == Operations.MULTPLICAR) {
                return Operations.MULTPLICAR;
            }
            else if (operation == Operations.DIVIDIR) {
                return Operations.DIVIDIR;
            }
            System.out.println("Nenhuma operação foi selecionada!");
        }
        catch (InputMismatchException exception) {
            System.out.println("Entrada inválida!");
        }

        return operation;
    }

    public float captureInput() {
        try {
            float value = keyboardReader.nextFloat();
            return value;
        }
        catch (InputMismatchException exception) {
            System.out.println("O valor inserido não é um número válido!");
        }

        return Float.MIN_VALUE;
    }
}
