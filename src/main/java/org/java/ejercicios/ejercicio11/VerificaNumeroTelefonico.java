package org.java.ejercicios.ejercicio11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Solicita al usuario que ingrese un número de teléfono y valida si cumple con el formato válido de un número de teléfono (por ejemplo, +1-123-456-7890) utilizando expresiones regulares.
 */

public class VerificaNumeroTelefonico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu teléfono: ");

        try{
            String numTelefono = scanner.next();

            Pattern patron = Pattern.compile("\\+\\d{1,2}-\\d{3}-\\d{3}-\\d{4}");

            Matcher matcher = patron.matcher(numTelefono);

            if (matcher.matches()) {
                System.out.println("Núm. de teléfono válido.");
            } else {
                System.out.println("Núm. de teléfono no válido.");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
