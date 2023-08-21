package org.java.ejercicios.ejercicio12;

/**
 * Escribe una función que tome una cadena de texto como entrada y devuelva la cadena invertida. Por ejemplo, si se ingresa "Hola, mundo", la función debería devolver "odnum ,aloH".
 */

public class RevertirCadena {
    public static void main(String[] args) {
        String cadena = "Hola, mundo";
        String cadenaRevertida = "";

        System.out.println("Cadena original: " + cadena);

        for (int i = 0; i < cadena.length(); i++) {
            cadenaRevertida += cadena.charAt(cadena.length() - 1 - i);
        }

        System.out.println("Cadena revertida: " + cadenaRevertida);
    }
}
