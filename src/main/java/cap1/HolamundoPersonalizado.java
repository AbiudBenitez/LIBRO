package cap1;

import java.util.Scanner;

public class HolamundoPersonalizado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hello world! " + nombre);

        scanner.close();

    }
}