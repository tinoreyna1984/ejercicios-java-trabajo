package org.java.ejercicios.ejercicio02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Dada una cadena de texto que contiene información en el formato "Nombre:Juan;Edad:25;Profesión:Ingeniero", escribe un programa que extraiga y muestre por separado el nombre, la edad y la profesión.
 */

public class ExtraerInfoCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa cadena: ");

        try {
            // recibo el correo
            String cadena = scanner.next();

            String[] separados = cadena.split(";");

            Pattern pattern = Pattern.compile("[A-Za-záéíóúñ]+:[A-Za-záéíóúñ]+;[A-Za-záéíóúñ]+:[0-9]+;[A-Za-záéíóúñ]+:[A-Za-záéíóúñ]+");

            Matcher matcher = pattern.matcher(cadena);

            if (matcher.matches()) {
                System.out.println("Cumple con el patrón.");
            } else {
                System.out.println("No cumple con el patrón.");
                System.exit(0);
            }

            for (int i = 0; i < separados.length; i++) {
                //System.out.println("Porción: " + separados[i]);
                String[] infoPair = separados[i].split(":");
                System.out.println("Tu " + infoPair[0].toLowerCase() + " es " + infoPair[1]);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
