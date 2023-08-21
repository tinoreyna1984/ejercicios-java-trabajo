package org.java.ejercicios.ejercicio05;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Solicita al usuario que ingrese su fecha de nacimiento en formato "dd/mm/aaaa" y valida si la fecha ingresada es una fecha válida y si la persona tiene al menos 18 años.
 */

public class ValidarFechaNacimiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Ingresa tu fecha de naciomiento (dd/MM/yyyy): ");
            String fechaIngresada = scanner.next();
            LocalDate fechaNacimiento = LocalDate.parse(fechaIngresada, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate hoy = LocalDate.now();
            Period edad = Period.between(fechaNacimiento, hoy);
            if(edad.getYears() >= 18)
                System.out.println("Tu edad es " + edad.getYears() + " años. Estás en el grupo de 18 a más años.");
        }
        catch (Exception e){
            System.out.println("Formato no válido (Mensaje de Java: " + e.getMessage() + ").");
        }
    }
}
