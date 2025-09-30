// 1. Importar la clase Scanner
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 2. Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // 3. Pedir el nombre de la araña y leerlo
        System.out.print("Introduce el nombre de la araña: ");
        String nombre = scanner.nextLine();



        // Cerrar el scanner (opcional, pero buena práctica)
        scanner.close();
    }
}