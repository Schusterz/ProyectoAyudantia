package proyectoayudantia2;

public class Player {

    int salud = 15;
    int posicion = 0;
    int meditaciones;
    String Nombre;

    public Player(String Nombre) {
        this.Nombre = Nombre;
        this.meditaciones = 5;
    }

    public void LanzarDados() {
        Dados dados = new Dados();
        Reliquia reliquia = new Reliquia();
        int Resultado = dados.lanzarDados();
        int Random1 = (int) (Math.random() * 100) + 1;
        int Random50 = (int) (Math.random() * 2) + 1;
        if (Random1 == 4 && Resultado != 12) {
            reliquia.ReliquiaVida(this);
        } else if (Resultado == 12 && Random50 == 1) {
            reliquia.ReliquiaVida(this);
        }
    }

    public void meditar() {
        if (this.getMeditaciones() > 0) {
            System.out.println("Ingrese cantidad de casillas que desea moverse. ");
            this.meditaciones = this.meditaciones - 1;
            salud = salud + 1;
        } else {
            System.out.println("No te quedan mas meditar");
            salud = salud - 1;

        }
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getMeditaciones() {
        return meditaciones;
    }

    public void setMeditaciones(int meditaciones) {
        this.meditaciones = meditaciones;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
