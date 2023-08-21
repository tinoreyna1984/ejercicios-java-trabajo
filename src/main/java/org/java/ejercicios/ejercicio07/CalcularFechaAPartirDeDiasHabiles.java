package org.java.ejercicios.ejercicio07;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Crea un programa que calcule y muestre la fecha que será n días hábiles después de una fecha ingresada, excluyendo los fines de semana (sábado y domingo) y días festivos.
 */

public class CalcularFechaAPartirDeDiasHabiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try
        {
            String strFecha = "";
            long diasSumar = 0L, diasLoop = 0;
            System.out.print("Ingrese fecha: ");
            strFecha = scanner.next();
            System.out.print("Ingrese dias a sumar: ");
            diasSumar = scanner.nextLong();
            LocalDate fecha = LocalDate.parse(strFecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate proximaFecha = fecha;
            while(diasLoop < diasSumar){
                proximaFecha = proximaFecha.plusDays(1);
                if (!(proximaFecha.getDayOfWeek() == DayOfWeek.SATURDAY || proximaFecha.getDayOfWeek() == DayOfWeek.SUNDAY)) {
                    ++diasLoop;
                }
            }
            System.out.println("Próxima fecha: " + proximaFecha);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
