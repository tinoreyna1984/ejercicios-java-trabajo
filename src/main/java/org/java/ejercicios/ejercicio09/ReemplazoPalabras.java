package org.java.ejercicios.ejercicio09;

import java.util.ArrayList;
import java.util.List;

/**
 * Escribe un programa que tome una cadena de texto y reemplace una palabra específica por otra en todo el texto, manteniendo el caso original.
 */

public class ReemplazoPalabras {
    public static void main(String[] args) {
        String parrafo = "El que no trabaje, que no coma";
        String termBusqueda = "no";
        String reemplazo = "si";

        System.out.println("Párrafo: " + parrafo);
        System.out.println("Término a reemplazar: " + termBusqueda);
        System.out.println("Término de sustitución: " + reemplazo);

        // descontar caracteres no esenciales y pasar toda la expresión a minúsculas
        parrafo = parrafo.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // dividir párrafo en palabras
        String[] palabras = parrafo.split("\\s+");

        // crear lista de las palabras almacenadas
        List<String> listaPalabras = new ArrayList<>();

        // busca palabras del arreglo que coincidan con el término de búsqueda
        for(String palabra : palabras){
            if(palabra.equalsIgnoreCase(termBusqueda)){
                palabra = reemplazo;
            }
            listaPalabras.add(palabra);
        }

        // unimos las palabras separadas por espacio
        parrafo = String.join(" ", listaPalabras);

        // mostramos el resultado
        System.out.println("Párrafo nuevo: " + parrafo);

    }
}
