/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_1;

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {

    int limite = 4;
    int mejorPosicion = 0;
    int mejorTiempo = 0;
    int[] coches = new int[limite];
    int[] tiempos = new int[limite];
    Scanner capturador = new Scanner(System.in);
    System.out.println(" CARGA DE DATOS DE PILOTOS");
    for (int index = 0; index < limite; index++) {
      System.out.println("Del piloto n" + (index + 1) + ":");
      System.out.print("Ingrese numero de coche: ");
      coches[index] = capturador.nextInt();
      System.out.print("Ingrese su tiempo de carrera: ");
      tiempos[index] = capturador.nextInt();
      System.out.println("***");
    }
    mejorPosicion = coches[0];
    mejorTiempo = tiempos[0];
    for (int index = 0; index < limite; index++) {
      if (mejorTiempo > tiempos[index]) {
        mejorPosicion = coches[index];
        mejorTiempo = tiempos[index];
      }
    }
    System.out.println(" MEJOR TIEMPO ");
    System.out.println("Numero de coche: " + mejorPosicion + ", tiempo: " + mejorTiempo);
    capturador.close();
  }
}


