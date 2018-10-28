/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoayudantia;

public class Mostrar {

    public Mostrar() {
    }

    public static void mostrarArrayString(String[] nombreJugadores) {

        for (int i = 0; i < nombreJugadores.length; i++) {

            System.out.print(nombreJugadores[i] + " ");

        }

        System.out.println("");
    }

    public static void mostrarArrayInt(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

        System.out.println("");
    }

    public static void mostrarTablero(char[] tablero) {

        for (int i = 0; i < tablero.length; i++) {

            System.out.print(tablero[i] + " ");

        }

        System.out.println("");
    }

}
