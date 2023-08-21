package org.java.ejercicios.ejercicio10;

import java.util.Scanner;

/**
 * Solicita al usuario ingresar un número de tarjeta de crédito y verifica si el número es válido según el algoritmo de Luhn, que es un método comúnmente utilizado para validar números de tarjetas.
 */

public class ValidarTarjetaCredito {

    public static boolean validaTarjeta(String numTarjeta){
        if(numTarjeta.length() > 16)
            return false;
        numTarjeta = numTarjeta.replaceAll("\\s+", "");

        if (!numTarjeta.matches("\\d+")) {
            return false;
        }

        int sum = 0;
        boolean doubleDigit = false;

        for (int i = numTarjeta.length() - 1; i >= 0; i--) {
            int digit = numTarjeta.charAt(i) - '0';

            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            doubleDigit = !doubleDigit;
        }

        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa número de tarjeta de crédito: ");
        try{
            String tarjeta = scanner.next();
            System.out.println("La tarjeta de crédito es " + (validaTarjeta(tarjeta) ? "válida" : "inválida"));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
