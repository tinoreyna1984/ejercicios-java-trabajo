package org.java.ejercicios.ejercicio04;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Escribe un programa que tome dos fechas como entrada y calcule la diferencia en años y meses entre ellas.
 */

public class CalcularDiferenciaFechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try
        {
            String strFecha01 = "", strFecha02 = "";
            System.out.print("Ingrese fecha 01: ");
            strFecha01 = scanner.next();
            LocalDate fecha01 = LocalDate.parse(strFecha01, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Ingrese fecha 02: ");
            strFecha02 = scanner.next();
            LocalDate fecha02 = LocalDate.parse(strFecha02, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            int diferenciaAnnos = Math.abs(Period.between(fecha01, fecha02).getYears());
            int diferenciaMeses = Math.abs(Period.between(fecha01, fecha02).getMonths());
            System.out.println("El periodo de las fechas ingresadas tiene " + diferenciaAnnos + " años y " + diferenciaMeses + " meses.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
