package org.java.ejercicios.ejercicio15;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Escribe una función que tome la fecha actual y la fecha de nacimiento de una persona, y calcule cuántos días faltan para su próximo cumpleaños.
 */

public class DiasHastaElCumpleannos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Ingresa tu fecha de naciomiento (dd/MM/yyyy): ");
            String fechaIngresada = scanner.next();
            LocalDate fechaNacimiento = LocalDate.parse(fechaIngresada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate hoy = LocalDate.now();
            Period edad = Period.between(fechaNacimiento, hoy);
            LocalDate fechaProxCumpleannos = LocalDate.of(2024,5,5);
            System.out.println("Tu edad es " + edad.getYears() + " años.");
            long tiempoProxCumple = ChronoUnit.DAYS.between(hoy, fechaProxCumpleannos);
            System.out.println("Faltan " + tiempoProxCumple + " días para el próximo cumpleaños.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
