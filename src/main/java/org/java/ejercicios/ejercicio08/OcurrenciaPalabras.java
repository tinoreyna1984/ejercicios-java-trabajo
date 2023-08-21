package org.java.ejercicios.ejercicio08;

import java.util.*;

/**
 * Dado un párrafo de texto, implementa un programa que cuente cuántas veces aparece cada palabra en el texto y muestre el resultado ordenado por frecuencia.
 */

public class OcurrenciaPalabras {
    public static void main(String[] args) {

        String paragraph = "Este es un ejemplo de párrafo. Un ejemplo simple para contar palabras en Java. Ejemplo es la palabra clave.";

        // Eliminar signos de puntuación y convertir a minúsculas
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Dividir el párrafo en palabras
        String[] words = paragraph.split("\\s+");

        // Crear un mapa para almacenar la frecuencia de las palabras
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Contar la frecuencia de las palabras
        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        // Convertir el mapa en una lista de pares (palabra, frecuencia)
        List<Map.Entry<String, Integer>> wordFrequencyList = new ArrayList<>(wordFrequencyMap.entrySet());

        // Ordenar la lista por frecuencia en orden descendente
        wordFrequencyList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Mostrar los resultados ordenados
        for (Map.Entry<String, Integer> entry : wordFrequencyList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
