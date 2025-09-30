// 1. Importar la clase Scanner
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 1. Crea un objeto Scanner para leer la entrada de la consola
        Scanner scanner = new Scanner(System.in);

        // 2. Pide al usuario que introduzca el nombre de la araña
        System.out.print("Como se llama la araña?: ");

        // 3. Lee el nombre introducido por el usuario y lo guarda en una variable String
        String nombre = scanner.next();

        // 4. Empieza la historia
        System.out.println("\n" + nombre + ", la araña residente del aula de 1º de DAM, " +
                "decide que ya ha pasado demasiado tiempo observando desde el techo. " +
                "Hoy es el día en que abandonará su rincón polvoriento para enfrentarse " +
                "al mundo… o al zapato de alguien.");
        System.out.println("\nQuieres que " + nombre + " escape por el conducto de aire " +
                "acondicionado o bajando por la pata de una mesa?: ");





        // 5. Cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}