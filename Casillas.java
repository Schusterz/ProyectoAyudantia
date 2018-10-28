package proyectoayudantia;

public class Casillas {

    public Casillas() {
    }

    public void casillaPortal(char tablero[], int[] PosicionJugador, int indexJugador) {

        int random = (int) (Math.random() * 2) + 1;
        if (random == 1) {
            for (int i = 0; i < tablero.length; i++) {
                tablero[i] = 'p';
                PosicionJugador[indexJugador] = PosicionJugador[i];
            }
        } else if (random == 2) {
            for (int i = tablero.length - 1; i >= 0; i--) {

                tablero[i] = 'p';
                PosicionJugador[indexJugador] = PosicionJugador[i];
            }
        }
    }

    public static void casillaSalud(int indiceJugador, int saludJugadores[]) {
        //suerte=0 => se le resta vida
        //suerte=1 => se le suma vida
        int suerte = (int) (Math.random() * 2);
        int vidaRandom = (int) (Math.random() * 3 + 1);

        if (suerte == 0) {
            //se debe validar que la salud no sea menor a 0
            //si la salud llega a 0, el jugador debe perder!
            saludJugadores[indiceJugador] -= vidaRandom;
            if (saludJugadores[indiceJugador] <= 0) {
                System.out.println("El jugador " + indiceJugador + " perdio.");
            }
        } else {
            //se debe validar que la salud no sea mayor a 15
            saludJugadores[indiceJugador] += vidaRandom;
            if (saludJugadores[indiceJugador] > 15) {
                saludJugadores[indiceJugador] = 15;
            }
        }
    }

    public void casillaDesafio(int indiceJugador, int saludJugadores[], int posicionJugadores[]) {
        int a = (int) (Math.random() * 2) + 1;
        int s = (int) (Math.random() * 2) + 1;
        //salud
        if (a == 1) {
            a = (int) (Math.random() * 4) + 1;
            if (s == 1) {
                saludJugadores[indiceJugador] -= a;

            } else {
                saludJugadores[indiceJugador] += a;
            }
            //posicion
            if (a == 2) {
                a = (int) (Math.random() * 5) + 1;
                if (s == 1) {
                    posicionJugadores[indiceJugador] += a;
                } else {
                    posicionJugadores[indiceJugador] += a;
                }
            }

        }

    }
}
