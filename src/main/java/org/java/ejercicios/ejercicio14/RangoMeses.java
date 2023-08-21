package org.java.ejercicios.ejercicio14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Dada una fecha en formato "dd/mm/yyyy", escribe una función que determine en qué rango de meses (trimestre) cae la fecha y devuelva el número del trimestre (1, 2, 3 o 4).
 */

public class RangoMeses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try
        {
            String strFecha01 = "";
            int trimestre = 0;
            System.out.print("Ingrese fecha 01: ");
            strFecha01 = scanner.next();
            LocalDate fecha01 = LocalDate.parse(strFecha01, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if(fecha01.getMonthValue() <= 3)
                trimestre = 1;
            else if(fecha01.getMonthValue() <= 6)
                trimestre = 2;
            else if(fecha01.getMonthValue() <= 9)
                trimestre = 3;
            else
                trimestre = 4;
            System.out.println("Trimestre: " + trimestre);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
