/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_2;


import java.util.Scanner;

public class TP_2 {

  private final int CANTIDAD_FILAS = 10;
  private final int CANTIDAD_COLUMNAS = 10;

  public char[][] limpiarAsientos() {
    char[][] asientos = new char[CANTIDAD_FILAS][CANTIDAD_COLUMNAS];
    for (int fila = 0; fila < CANTIDAD_FILAS; fila++) {
      for (int columna = 0; columna < CANTIDAD_COLUMNAS; columna++) {
        asientos[fila][columna] = 'O';
      }
    }
    return asientos;
  }

  public void mostrarAsientos(char[][] asientos) {
    TP_2 obj = new TP_2();
    for (int fila = 0; fila < obj.CANTIDAD_FILAS; fila++) {
      for (int columna = 0; columna < obj.CANTIDAD_COLUMNAS; columna++) {
        int numeroAsiento = columna + (fila * 10) + 1;
        System.out.print(String.format("%1$3s", String.valueOf(numeroAsiento)).replace(' ', '0') + " ");
      }
      System.out.println();
      for (int columna = 0; columna < obj.CANTIDAD_COLUMNAS; columna++) {
        System.out.print("[" + asientos[fila][columna] + "] ");
      }
      System.out.println();
      System.out.println();
    }
  }

  private int[] solicitarCoordenadas() {
    int[] coordenadas = new int[2];
    Scanner ingreso = new Scanner(System.in);
    System.out.print("Ingrese la fila del asiento: ");
    coordenadas[0] = ingreso.nextInt() - 1;
    ingreso.nextLine();
    System.out.print("Ingrese la columna del asiento: ");
    coordenadas[1] = ingreso.nextInt() - 1;
    return coordenadas;
  }

  private String solicitarCorreoElectronico() {
    String correoElectronico = null;
    Scanner ingreso = new Scanner(System.in);
    System.out.print("Ingrese su correo electronico: ");
    correoElectronico = ingreso.nextLine();
    return correoElectronico;
  }

  private String solicitarTelefono(){
    String telefono = null;
    Scanner ingreso = new Scanner(System.in);
    System.out.print("Ingrese su numero de telefono: ");
    telefono = ingreso.nextLine();
    return telefono;
  }

  private boolean revisarAsiento(char[][] asientos, int fila, int columna) {
    boolean estaDisponible = false;
    if (asientos[fila][columna] == 'O') {
      estaDisponible = true;
    }
    return estaDisponible;
  }

  public void reservar(char[][] asientos, String[][]correos, String[][]telefonos) {
    int[] coordenadas = this.solicitarCoordenadas();
    boolean controlAsiento = this.revisarAsiento(asientos, coordenadas[0], coordenadas[1]);
    if (controlAsiento) {
      String correoElectronico = this.solicitarCorreoElectronico();
      String telefono = this.solicitarTelefono();
      asientos[coordenadas[0]][coordenadas[1]] = 'X';
      correos[coordenadas[0]][coordenadas[1]] = correoElectronico;
      telefonos[coordenadas[0]][coordenadas[1]] = telefono;
    } else {
      System.err.println("asiento reservado");
    }
  }

  public void eliminarReserva(char[][] asientos, String[][]correos, String[][]telefonos) {
    int[] coordenadas = this.solicitarCoordenadas();
    asientos[coordenadas[0]][coordenadas[1]] = 'O';
    correos[coordenadas[0]][coordenadas[1]] = null;
    telefonos[coordenadas[0]][coordenadas[1]] = null;
  }

  public static void main(String[] args) {
    int opcion = 0;
    TP_2 obj = new TP_2();
    Scanner ingreso = null;
    char[][] asientos = obj.limpiarAsientos();
    String[][] correosElectronicos = new String[obj.CANTIDAD_FILAS][obj.CANTIDAD_COLUMNAS];
    String[][] telefonos = new String[obj.CANTIDAD_FILAS][obj.CANTIDAD_COLUMNAS];
    while (true) {
      ingreso = new Scanner(System.in);
      obj.mostrarAsientos(asientos);
      System.out.print("Ingrese una opcion para seguir, [1]reservar asiento [2]eliminar reserva: ");
      opcion = ingreso.nextInt();
      switch (opcion) {
        case 1:
          obj.reservar(asientos, correosElectronicos, telefonos);
          break;
        case 2:
          obj.eliminarReserva(asientos, correosElectronicos, telefonos);
          break;
      }
    }
  }
}