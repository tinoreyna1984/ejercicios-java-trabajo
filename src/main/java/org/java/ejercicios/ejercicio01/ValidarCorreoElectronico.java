package org.java.ejercicios.ejercicio01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un programa que solicite al usuario ingresar su dirección de correo electrónico y luego valide si es una dirección de correo electrónico válida utilizando expresiones regulares.
 */

public class ValidarCorreoElectronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu correo electrónico: ");

        try {
            // recibo el correo
            String email = scanner.next();

            // patrón de validación (regEx)
            Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

            // objeto de validación (matcher)
            Matcher matcher = pattern.matcher(email);

            // procesa la validación
            if (matcher.matches()) {
                System.out.println("Correo válido.");
            } else {
                System.out.println("Correo no válido.");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
