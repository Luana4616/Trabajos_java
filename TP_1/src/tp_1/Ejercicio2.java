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

/**
 *
 * @author Estudiante
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas : ");
        int n = sc.nextInt();

        double[] notas = new double[n];

        // Cargar las notas
        for (int i = 0; i < n; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Contadores
        int aprobados = 0;
        int desaprobados = 0;

        for (double nota : notas) {
            if (nota >= 6) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        // Mostrar resultados
        System.out.println("\nTotal de notas: " + n);
        System.out.println("Aprobados con  mayor o igual a 6: " + aprobados);
        System.out.println("Desaprobados menor a 6 : " + desaprobados);

        sc.close();
    
       
    }
    
}

