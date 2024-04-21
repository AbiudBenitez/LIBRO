package cap1;

import java.util.Scanner;

public class EstructurasDeControl {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese su edad: ");
    int edad = sc.nextInt();

    String msg = (edad > 18) ? "Bienvenido" : "Debe ser mayor a 18";
    System.out.println(msg);

    sc.close();
  }
}
