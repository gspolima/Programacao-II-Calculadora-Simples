package com.estacio.programacaoII;

import javax.swing.text.NumberFormatter;
import java.text.Format;
import java.util.Formatter;

public class UIDrawer {
    public void displayAvailableOperations(){
        System.out.println("------------------------------");
        System.out.println("ESCOLHA UMA DAS OPERAÇÕES:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("------------------------------");
    }

    public void askForFirstInputValue() {
        System.out.println("Entre com o primeiro valor");
    }
    public void askForSecondInputValue() {
        System.out.println("Entre com o segundo valor");
    }
    public void displayResult(float result) {
        System.out.println("O resultado é: " + result);
    }
}
