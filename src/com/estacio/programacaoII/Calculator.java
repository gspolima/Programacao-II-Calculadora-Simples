package com.estacio.programacaoII;

public class Calculator {
    public float calculate(int operationId, float firstValue, float secondValue) {
        try {
            if (operationId == Operations.SOMAR) {
                return firstValue + secondValue;
            }
            else if (operationId == Operations.SUBTRAIR) {
                return firstValue - secondValue;
            }
            else if (operationId == Operations.MULTPLICAR) {
                return firstValue * secondValue;
            }
            else if (operationId == Operations.DIVIDIR) {
                return firstValue / secondValue;
            }
        }
        catch (Exception exception) {
            System.out.println("Erro catastrófico: " + exception.getMessage());
        }

        return Float.MAX_VALUE;
    }
}
