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

        // DECISIÓN 1: Hasta que altura baja la araña?
        Scanner escape = new Scanner(System.in);
        System.out.println("\nQuieres que " + nombre + " baje 3 metros o 5 metros?: ");

        // A) 3 metros. ➡️ Sigue a DECISIÓN 2A
        // B) 5 metros. ➡️ Sigue a DECISIÓN 2B
        byte decisionAltura = escape.nextByte();


        // DECISIÓN 2A (Si eligió 3 metros): ¿Dónde aterriza dentro del aula?
        Scanner teclado = new Scanner(System.in);
        if (decisionAltura == 3) {
            System.out.println("\n" + nombre + " cae encima de un teclado. " + nombre + " pisa la tecla enter " +
                    "o el shift?: ");
        }
        // A) Enter. ➡️ Sigue a DECISIÓN 3A1
        // B) Shift. ➡️ Sigue a DECISIÓN 3A2
        String decisionEnter = teclado.nextLine();


        // DECISIÓN 2B (Si eligió 5 metros): ¿Hacia dónde corre en el suelo?
        Scanner mesa = new Scanner(System.in);
        if (decisionAltura == 5) {
            System.out.println("\n" + nombre + " llega al suelo, " + nombre + " corre a esconderse debajo " +
                    "de una mochila o hacia una papelera?: ");
        }
        // A) Bajo una mochila. ➡️ Sigue a DECISIÓN 3B1
        // B) Hacia una papelera. ➡️ Sigue a DECISIÓN 3B2
        String decisionSuelo = mesa.nextLine();

        scanner.nextLine(); // limpiar el buffer

        // DECISIÓN 3A1 (3 → Enter)
        Scanner enter = new Scanner(System.in);
        if (decisionEnter.equals("enter")) {
            System.out.println("\nEl ordenador abre 27 pestañas a la vez. El alumno grita: " +
                    "“¡¡MI PC ESTÁ POSEÍDO!!” " + nombre + " aprovecha el caos para correr " +
                    "hacia el aula de ASIR 1 o hacia el aula de ASIR 1 haciendo zig-zag?");
        }
        // A) El aula de ASIR 1. ➡️ FINAL 1
        // B) El aula de ASIR 1 haciendo zig-zag. ➡️ FINAL 2
        String decisionOrdenador = enter.nextLine();

        // DECISIÓN 3A2 (3 → Shift)
        Scanner shift = new Scanner(System.in);
        if (decisionEnter.equals("shift")) {
            System.out.println("El bloqueo de mayúsculas se activa. El alumno escribe todo " +
                    "en plan: “PROFEEEE EL WIFI NO VA” Cunde el pánico. " + nombre + " para " +
                    "escapar hacia el aula de ASIR 1 o hacia el aula de ASIR 1 haciendo piruetas?");
        }
        // A) El aula de ASIR 1. ➡️ FINAL 3
        // B) El aula de ASIR 1 haciendo piruetas. ➡️ FINAL 4
        String decisionMayusculas = shift.nextLine();

        // DECISIÓN 3B1 (5 → Mochila)
        Scanner mochila = new Scanner(System.in);
        if (decisionSuelo.equals("mochila")) {
            System.out.println("La mochila catapulta a " + nombre + " hacia el pasillo como " +
                    "si fuera un proyectil vivo. " + nombre + " corre hacia el aula de ASIR 1 " +
                    "o hacia el aula de ASIR 1 gritando?");
        }
        // A) Directa al aula de ASIR 1. ➡️ FINAL 5
        // B) Al aula de ASIR 1 gritando. ➡️ FINAL 6
        String decisionMochila = mochila.nextLine();

        // DECISIÓN 3B2 (5 → Papelera)
        Scanner papelera = new Scanner(System.in);
        if (decisionSuelo.equals("papelera")) {
            System.out.println(nombre + " resbala en un trozo de bocadillo dentro y sale " +
                    "rodando al pasillo. " + nombre + " decide ir hacia el aula de ASIR 1 " +
                    "o hacia el aula de ASIR 1 dramatizando su sufrimiento?");
        }
        // A) Al aula de ASIR 1. ➡️ FINAL 7
        // B) Al aula de ASIR 1 dramatizando su sufrimiento. ➡️ FINAL 8
        String decisionPapelera = papelera.nextLine();

        // Final 1 — Aplastamiento Directo (Clásico)
        if (decisionOrdenador.equals("ASIR 1")) {
            System.out.println(nombre + " entra al aula de ASIR 1 con sigilo. Nadie le" +
                    " ve... excepto una zapatilla del 43 ¡PLOF! " + "la vida de " + nombre + " fue " +
                    "breve, pero intensa.");
        }

        // Final 2 — Aplastamiento en Zig-Zag
        if (decisionOrdenador.equals("zig zag")) {
            System.out.println(nombre + " intenta esquivar con movimientos serpenteantes. " +
                    "El alumno también. Resultado: Aplastamiento con estilo parkour.");
        }


        // 5. Cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}