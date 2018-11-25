package proyectoayudantia2;

public class Guerrero extends Player {

    int furia;

    public Guerrero(String Nombre) {

        super(Nombre);
        this.salud = 20;
        this.furia = 5;

    }

    public void enfurecerse(Player[] Jugadores, int i) {
        if (this.furia > 0) {

            Jugadores[i].setSalud(Jugadores[i].getSalud() - 1);
            this.furia -= 1;
        } else {
            System.out.println("No le queda mas furia.");
        }
    }

}
