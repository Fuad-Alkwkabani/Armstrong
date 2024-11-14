package NumeroArmstrongApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número para verificar si es un número de Armstrong: ");
        int numero = scanner.nextInt();

        ArmstrongCheck checker = new ArmstrongCheck(numero);
        

    }
}