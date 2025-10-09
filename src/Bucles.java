import java.util.Scanner;
public class Bucles {
    public static void main(String[] args) {
        // Crear un programa que pida por teclado un número. Después, tiene que imprimir
        // todos los números pares hasta dicho número

        // Bucle FOR
        Scanner lector = new Scanner(System.in);
        /*System.out.print("Introduce un número: ");

        int numeroComprobar = lector.nextInt();

        for (int x = 2; x <= numeroComprobar; x += 2) {
                System.out.println("El número " + x + " es par");
        }
        System.out.println("Hemos acabado");

        // Bucle WHILE
        int numeroEntrada = lector.nextInt();

        while (numeroEntrada > 1) {
            System.out.println("El número es mayor que 1: " + numeroEntrada);
            numeroEntrada = numeroEntrada / 2;
        }
        System.out.println("El número ya no es mayor que 1: " + numeroEntrada);
        */
        System.out.println("Desde que número quieres imprimir?: ");
        int numeroInicial = lector.nextInt();
        System.out.println("Hasta que número quieres imprimir?: ");
        int numeroFinal = lector.nextInt();

        int numeroImprimirWhile = numeroInicial;

        while (numeroImprimirWhile <= numeroFinal) {
            System.out.println(numeroImprimirWhile);
            numeroImprimirWhile++;
        }

        for (int numeroImprimir = numeroInicial; numeroImprimir <= numeroFinal; numeroImprimir++) {
            System.out.println(numeroImprimir);
        }


    }
}
