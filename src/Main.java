// 1. Importar la clase Scanner
import java.sql.SQLOutput;
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
        System.out.println("\nQuieres que " + nombre + " baje 3 metros o 5 metros?: ");
        System.out.println("1) 3");
        System.out.println("2) 5");
        System.out.println("Escribe 3 o 5: ");

        // A) 3 metros. ➡️ Sigue a DECISIÓN 2A
        // B) 5 metros. ➡️ Sigue a DECISIÓN 2B
        byte decisionAltura = scanner.nextByte();


        // DECISIÓN 2A (Si eligió 3 metros): ¿Dónde aterriza dentro del aula?
        if (decisionAltura == 3) {
            System.out.println("\n" + nombre + " cae encima de un teclado. " + nombre + " pisa " +
                    "la tecla enter o el shift?: ");
            System.out.println("1) enter");
            System.out.println("2) shift");
            System.out.println("Escribe enter o shift: ");
            // A) Enter. ➡️ Sigue a DECISIÓN 3A1
            // B) Shift. ➡️ Sigue a DECISIÓN 3A2
            String decisionTeclado = scanner.next();

            // DECISIÓN 3A1 (3 → Enter)
            if (decisionTeclado.equals("enter")) {
                System.out.println("\nEl ordenador abre 27 pestañas a la vez. El alumno grita: " +
                        "“¡¡MI PC ESTÁ POSEÍDO!!” " + nombre + " aprovecha el caos para correr " +
                        "hacia el aula de ASIR 1 o hacia el aula de ASIR 1 haciendo zig-zag?");
                System.out.println("1) Aula de ASIR 1");
                System.out.println("2) Aula de ASIR 1 haciendo zig-zag");
                System.out.println("Elige 1 o 2: ");
                // A) El aula de ASIR 1. ➡️ FINAL 1
                // B) El aula de ASIR 1 haciendo zig-zag. ➡️ FINAL 2
                byte decisionEnter = scanner.nextByte();

                // Final 1 — Aplastamiento Directo (Clásico)
                if (decisionEnter == 1) {
                    System.out.println(nombre + " entra al aula de ASIR 1 con sigilo. Nadie " +
                            "le ve... excepto una zapatilla del 43 ¡PLOF! " + "la vida " +
                            "de " + nombre + " fue breve, pero intensa.");
                }
                // Final 2 — Aplastamiento en Zig-Zag
                if (decisionEnter == 2) {
                    System.out.println(nombre + " intenta esquivar con movimientos serpenteantes. " +
                            "El alumno también. Resultado: Aplastamiento con estilo parkour.");
                }
            }
            // DECISIÓN 3A2 (3 → Shift)
            else if (decisionTeclado.equals("shift")) {
                System.out.println("El bloqueo de mayúsculas se activa. El alumno escribe " +
                        "todo en plan: “PROFEEEE EL WIFI NO VA” Cunde el pánico. " + nombre +
                        " intenta escapar hacia el aula de ASIR 1 o hacia el aula de ASIR 1 " +
                        "haciendo piruetas?");
                System.out.println("1) Aula de ASIR 1");
                System.out.println("2) Aula de ASIR 1 haciendo piruetas");
                System.out.println("Elige 1 o 2: ");
                // A) El aula de ASIR 1. ➡️ FINAL 3
                // B) El aula de ASIR 1 haciendo piruetas. ➡️ FINAL 4
                byte decisionShift = scanner.nextByte();

                // Final 3 — La araña se vuelve Influencer Tecnológica
                if (decisionShift == 1) {
                    System.out.println("Antes de morir, un alumno grita: “¡Quieto! ¡Voy a " +
                            "subir a " + nombre + " a TikTok!” En 24 horas, " + nombre +
                            " tiene 200.000 seguidores y un hashtag: #SpiderTech");
                }
                // Final 4 — La araña se matricula en ASIR
                if (decisionShift == 2) {
                    System.out.println(nombre + " cae sobre un formulario de inscripción. " +
                            "Uno de los alumnos escribe en broma: ");
                    System.out.println("\nNombre: " + nombre + " González");
                    System.out.println("Curso: ASIR 1");
                    System.out.println("\nEl profesor lo ve y dice: “Mientras no moleste... " +
                            "puede quedarse.”");
                }
            }
        }
        // DECISIÓN 2B (Si eligió 5 metros): ¿Hacia dónde corre en el suelo?
        else if (decisionAltura == 5) {
            System.out.println("\n" + nombre + " llega al suelo, " + nombre + " corre a " +
                    "esconderse debajo de una mochila o hacia una papelera?: ");
            System.out.println("1) Mochila");
            System.out.println("2) Papelera");
            System.out.println("Escribe mochila o papelera: ");
            // A) Bajo una mochila. ➡️ Sigue a DECISIÓN 3B1
            // B) Hacia una papelera. ➡️ Sigue a DECISIÓN 3B2
            String decisionSuelo = scanner.next();

            // DECISIÓN 3B1 (5 → Mochila)
            if (decisionSuelo.equals("mochila")) {
                System.out.println("La mochila catapulta a " + nombre + " hacia el pasillo " +
                        "como si fuera un proyectil vivo. " + nombre + " corre hacia el aula " +
                        "de ASIR 1 o hacia el aula de ASIR 1 gritando?");
                System.out.println("1) Aula de ASIR 1");
                System.out.println("2) Aula de ASIR 1 gritando");
                System.out.println("Elige 1 o 2: ");
                // A) Directa al aula de ASIR 1. ➡️ FINAL 5
                // B) Al aula de ASIR 1 gritando. ➡️ FINAL 6
                byte decisionMochila = scanner.nextByte();

                // Final 5 — Aplastamiento Existencial
                if (decisionMochila == 1) {
                    System.out.println(nombre + " piensa justo antes del impacto: “¿Y si " +
                            "el humano soy yo y ellos son las arañas?” No le dio tiempo " +
                            "a resolverlo...");
                }
                // Final 6 — Escape Épico por la Ventana
                if (decisionMochila == 2) {
                    System.out.println("Justo cuando iban a aplastarle, " + nombre + " usa " +
                            "un pelo de fregona como liana, se impulsa y escapa por la ventana. " +
                            "Ahora vive libre con vistas al aula.");
                }
            }
            // DECISIÓN 3B2 (5 → Papelera)
            else if (decisionSuelo.equals("papelera")) {
                System.out.println(nombre + " resbala en un trozo de bocadillo dentro y sale " +
                        "rodando al pasillo. " + nombre + " decide ir hacia el aula de ASIR 1 " +
                        "o hacia el aula de ASIR 1 dramatizando su sufrimiento?");
                System.out.println("1) Aula de ASIR 1");
                System.out.println("2) Aula de ASIR 1 dramatizando su sufrimiento");
                System.out.println("Elige 1 o 2: ");
                // A) Al aula de ASIR 1. ➡️ FINAL 7
                // B) Al aula de ASIR 1 dramatizando su sufrimiento. ➡️ FINAL 8
                byte decisionPapelera = scanner.nextByte();

                // Final 7 — La araña es ascendida a Diosa del Aula
                if (decisionPapelera == 1) {
                    System.out.println("Un alumno tropieza intentando aplastarlo. Todos " +
                            "creen que " + nombre + " lo derribó con sus poderes. Le ponen una " +
                            "pegatina en la pared: \n✨ “San " + nombre + " — PROTÉGENOS DE LOS EXÁMENES” ✨");
                }
                // Final 8 — Ayudante Oficial del Profesor
                if (decisionPapelera == 2) {
                    System.out.println("El profesor, harto de que nadie responda en clase, " +
                            "suspira: “Por lo menos la araña presta atención. A partir de " +
                            "hoy... será mi asistente técnico. " + nombre + " observa desde " +
                            "el teclado con aires de grandeza.");
                }
            }
        }

        // 5. Cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}