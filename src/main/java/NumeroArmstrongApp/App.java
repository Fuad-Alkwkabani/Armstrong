package NumeroArmstrongApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para verificar si es un número de Armstrong: ");
        int numero = scanner.nextInt();

        ArmstrongCheck checker = new ArmstrongCheck(numero);
        if (checker.IsArmstrong()) {
            System.out.println(numero + " es un número de Armstrong.");
        } else {
            System.out.println(numero + " no es un número de Armstrong.");
        }

        scanner.close();

    }
}