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

public class Ejercicio7{
  public static void main(String[] args) {

    int limite = 15;
    int cantidadMujeres = 0;
    int cantidadVarones = 0;
    float porcentajeVarones = 0;
    int[] edades = new int[limite];
    char[] sexos = new char[limite];
    String[] documentos = new String[limite];
    String mensaje = null;
    Scanner capturador = new Scanner(System.in);
    for (int index = 0; index < limite; index++) {
      System.out.println("Ingrese lo datos del las personas");
      System.out.print("Ingrese el numero de documento: ");
      documentos[index] = capturador.nextLine();
      System.out.print("Ingrese la edad de la persona: ");
      edades[index] = capturador.nextInt();
      capturador.nextLine();
      System.out.println("Opciones: [f]Mujer [m]Varon");
      System.out.print("Ingrese el sexo de la persona: ");
      sexos[index] = capturador.nextLine().charAt(0);
      if (sexos[index] == 'f') {
        cantidadMujeres = cantidadMujeres + 1;
      } else {
        cantidadVarones = cantidadVarones + 1;
      }
      if ((sexos[index] == 'm') && (edades[index] >= 16) && (edades[index] <= 65)) {
        porcentajeVarones = porcentajeVarones + 1;
      }
    }
    porcentajeVarones = (porcentajeVarones / cantidadVarones) * 100;
    System.out.println("Datos del censo");
    System.out.println("Cantidad de personas cesadas: " + documentos.length);
    System.out.println("Cantidad de varones: " + cantidadVarones);
    System.out.println("Cantidad de mujeres: " + cantidadMujeres);
    System.out.println("Datos de personas mayores");
    for (int index = 0; index < limite; index++) {
      if (edades[index] >= 18) {
        System.out.println("DOCUMENTO: " + documentos[index]);
        System.out.println("EDAD: " + edades[index]);
        System.out.println("SEXO: " + sexos[index]);
      }
    }
    mensaje = String.format("Porcentaje de varones, cuya edad es entre 16 y 65: %.2f", porcentajeVarones);
    System.out.println(mensaje);
    capturador.close();
  }
}



