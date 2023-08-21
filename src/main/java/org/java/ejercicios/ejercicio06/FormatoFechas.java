package org.java.ejercicios.ejercicio06;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * Escribe un programa que tome una fecha y la muestre en formato "dd de mes de aaaa", por ejemplo, "17 de agosto de 2023".
 */

public class FormatoFechas {
    public static String getMonthName(int month, Locale locale) {
        DateFormatSymbols symbols = new DateFormatSymbols(locale);
        String[] monthNames = symbols.getMonths();
        return monthNames[month - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Ingresa fecha (dd/MM/yyyy): ");
            String strFechaIngresada = scanner.next();
            LocalDate fechaIngresada = LocalDate.parse(strFechaIngresada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println(fechaIngresada.getDayOfMonth() + " de " + getMonthName(fechaIngresada.getMonthValue(), new Locale("es")) + " de " + fechaIngresada.getYear());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
