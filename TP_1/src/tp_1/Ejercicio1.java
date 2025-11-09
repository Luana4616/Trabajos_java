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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           float acumulador = 0;
           float promedio = 0;
           float notaAlta = 0;
           Scanner ingresor = new Scanner(System.in);
    System.out.print("ingrese el limite de notas: ");
    int limite = ingresor.nextInt();
    float[] notas = new float[limite];
    for (int index = 0; index < limite; index++){
        System.out.println("ingrese la nota: ");
        notas[index] = ingresor.nextFloat();
        acumulador = acumulador + notas[index];
        if (notaAlta < notas[index]){
            notaAlta = notas[index];
        }
        
    }
    promedio = acumulador / limite;
    System.out.println("la nota mas alta es : "+ notaAlta);
    System.out.println("promedio: "+ promedio);
    
    }
    
}
