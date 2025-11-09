/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_1;
import java.util.Scanner;


/**
 *
 * @author Estudiante
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String patente, nombreChofer, tipoCarga, horaEgreso;
        int contadorTe = 0;
        String[][] registros = new String[30][4];

        for (int i = 0; i < registros.length; i++) {
            System.out.println("---- Camión " + (i + 1) + " ----");
            System.out.print("Patente: ");
            patente = sc.nextLine();
            System.out.print("Nombre y apellido del chofer: ");
            nombreChofer = sc.nextLine();
            System.out.print("Tipo de carga (madera, yerba o te): ");
            tipoCarga = sc.nextLine();
            if (tipoCarga.equalsIgnoreCase("te")) {
                contadorTe++;
            }
            System.out.print("Hora de egreso: ");
            horaEgreso = sc.nextLine();
            registros[i][0] = patente;
            registros[i][1] = nombreChofer;
            registros[i][2] = tipoCarga;
            registros[i][3] = horaEgreso;
        }

        System.out.println("Camiones que cargaron te: " + contadorTe);
        System.out.println("Listado de camiones:");
        for (String[] cam : registros) {
            System.out.println("Patente: " + cam[0] + ", Chofer: " + cam[1] + ", Carga: " + cam[2] + ", Hora: " + cam[3]);
        }
        sc.close();
    }

    
}
