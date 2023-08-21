package org.java.ejercicios.ejercicio03;

import java.util.Scanner;

/**
 * Crea un generador de contraseñas que genere contraseñas seguras que cumplan con ciertos requisitos, como longitud mínima, presencia de letras mayúsculas y minúsculas, números y caracteres especiales.
 */

public class GeneradorContrasennas {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longMin = 0;
        System.out.print("Ingresa longitud mínima: ");
        longMin = scanner.nextInt();
        if(longMin % 2 != 0) longMin++;
        String contrasenna = "";
        for (int i = longMin; i <= 32; i++) {
            int valorDecimal = getRandomNumber(33, 126);
            contrasenna += (char)valorDecimal;
        }
        System.out.println("Contraseña generada: " + contrasenna);
    }
}
