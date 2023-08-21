package org.java.ejercicios.ejercicio13;

/**
 * Escribe una función que tome una cadena de texto como entrada y cuente cuántas palabras contiene. Considera que las palabras están separadas por espacios.
 */

public class ContadorPalabras {
    public static void main(String[] args) {
        String parrafo= "Vamos a aprender a programar en Java";
        System.out.println("Párrafo: " + parrafo);

        String[] palabras = parrafo.split("\\s+");

        System.out.println("El párrafo contiene " + palabras.length + " palabras");
    }
}
