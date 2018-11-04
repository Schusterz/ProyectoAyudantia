package proyectoayudantia;

public class Guardian {

    public Guardian() {
    }

    private void Furia(int saludJugadores[], int saludGuardian) {
        int Random2 = (int) (Math.random() * 50) + 1;
        if (Random2 == 3) {
            for (int i = 0; i < saludJugadores.length; i++) {
                saludJugadores[i] -= 1;
            }
            saludGuardian += 2;
        }

    }

    public void Guardian(int resDados, int saludJugadores[], int cantJugadores, int jugador) {
        int saludGuardian = cantJugadores * 15;
        Guardian furia = new Guardian();
        furia.Furia(saludJugadores, saludGuardian);
        if (resDados == 12) {
            saludGuardian -= 3;
        } else {
            saludGuardian -= 1;
        }
        if (saludGuardian == 0) {
            System.out.println("El jugador " + jugador + " es el ganador.");

            System.exit(0);

        }

    }

}
