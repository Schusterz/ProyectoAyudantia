package proyectoayudantia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Casillas casillas = new Casillas();
        Mostrar mostrar = new Mostrar();
        Player Player = new Player();
        int Cantcasillas = 0, cantJugadores = 0;

        while (Cantcasillas < 20) {
            try {
                System.out.println("Ingrese numero de casillas (no puede ser menor a 20)");
                Cantcasillas = leer.nextInt();
            } catch (InputMismatchException e) {
                leer.nextLine();
                System.out.println("Debe ingresar un valor numerico ");
            }
        }

        while (cantJugadores < 1) {
            try {
                System.out.println("Ingrese Numero de jugadores (mayor igual a 1)");
                cantJugadores = leer.nextInt();

            } catch (InputMismatchException e) {
                leer.nextLine();
                System.out.println("Debe ingresar un valor numerico ");
            }
        }

        Player.NombreJugadores(cantJugadores);
        Player.saludJugadores(cantJugadores);
        Player.posicionJugadores(cantJugadores);

        char[] mapa = tablero.generarTablero(Cantcasillas);
        mostrar.mostrarTablero(mapa);
        
    }

}
