/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_1;

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nCliente #" + i);
            System.out.print("Ingrese DNI: ");
            int dni = sc.nextInt();
            System.out.println("Tipo de servicio: ");
            System.out.println("1. Internet 30 megas ($750)");
            System.out.println("2. Internet 50 megas ($1100)");
            System.out.println("3. Internet 100 megas ($1500 con 5% de descuento)");
            int servicio = sc.nextInt();

            double monto = 0;
            if (servicio == 1) monto = 750;
            else if (servicio == 2) monto = 1100;
            else if (servicio == 3) monto = 1500 * 0.95;
            else System.out.println("Opción no válida.");

            System.out.println("DNI: " + dni + " | Servicio N° " + servicio + " | Monto a pagar: $" + monto);
        }
    }
}

