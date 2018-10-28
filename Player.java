package proyectoayudantia;

import java.util.Scanner;

public class Player {

    public Player() {

    }

    public static String[] NombreJugadores(int cantidad) {
        String[] nombreJugadores = new String[cantidad];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese nombre del jugador " + (i + 1));
            nombreJugadores[i] = leer.next();
        }
        return nombreJugadores;
    }

    public static int[] saludJugadores(int cantidad) {
        int[] saludJugadores = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            saludJugadores[i] = 15;
        }
        return saludJugadores;
    }

    public static int[] posicionJugadores(int cantidad) {
        int[] posicionJugadores = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            posicionJugadores[i] = 0;
        }
        return posicionJugadores;
    }

    public static int[] meditar(int cantidad) {
        int[] meditar = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            meditar[i] = 5;
        }
        return meditar;

    }

    public static void Reliquia(int sumadados, int indiceJugador, int saludJugadores[],
            int posicionJugador[], char[] mapa, int meditar[]) {
        int Random50 = (int) (Math.random() * 2) + 1;
        int Random1 = (int) (Math.random() * 100) + 1;
        int Random5 = (int) (Math.random() * 95) + 1;

        if (Random1 == 4 && sumadados != 12) {
            saludJugadores[indiceJugador] = 15;
        } else if (sumadados == 12 && Random50 == 1) {
            saludJugadores[indiceJugador] = 15;
        }
        if (mapa[posicionJugador[indiceJugador]] == 's' && Random5 == 65) {
            meditar[indiceJugador] += 1;
        }

    }

}
