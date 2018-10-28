package proyectoayudantia;

public class Tablero {

    public Tablero() {    
    }

    public static char[] generarTablero(int cantidadCasillas) {
        char tablero[] = new char[cantidadCasillas];

        tablero[0] = 'i';
        tablero[cantidadCasillas - 1] = 'f';

        for (int i = 1; i < cantidadCasillas - 1; i++) {
            tablero[i] = casillaRandom();
        }

        return tablero;
    }

    public static char casillaRandom() {
        /*
        b=blanco, p=portal, s=salud, d=desafio
         */
        char pool[] = {'b', 'p', 's', 'd'};

        int indiceRandom = (int) (Math.random() * 4);

        char selected = pool[indiceRandom];

        return selected;
    }

    public static int lanzarDados() {
        int dado1 = (int) (Math.random() * 6 + 1);
        int dado2 = (int) (Math.random() * 6 + 1);
        int sumaDados = dado1+dado2; 
        return sumaDados;
    }

}
