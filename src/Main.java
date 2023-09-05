import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Puntuaciones puntuaciones = new Puntuaciones();

        System.out.println("Para finalizar ingrese: " + "x ");

        while (puntuaciones.numEntradas < Puntuaciones.maxEntradas) {
            System.out.println("Escribe el nombre del jugador: ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("x")) {
                break;
            }

            System.out.println("Escribe la puntuación del jugador: ");
            int puntuacion = scanner.nextInt();
            scanner.nextLine();

            EntradaJuego entrada = new EntradaJuego(nombre, puntuacion);
            puntuaciones.add(entrada);
        }

        System.out.println("Puntuaciones ordenadas: ");
        System.out.println(puntuaciones.toString());

    }
}




/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        EntradaJuego juego = new EntradaJuego()

        /*
        System.out.println(" Ingrese su nombre de usuario ");
        String jugador = consola.nextLine();
        Nombre nombre = new Nombre(jugador);

    }
}
*/