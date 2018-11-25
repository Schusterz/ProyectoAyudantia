/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoayudantia2;

/**
 *
 * @author El Lalete
 */
public class Mago extends Player {
        int mana;
    
    public Mago(String Nombre) {
        super(Nombre);
        this.mana=4;
        this.meditaciones=7;
    }
    public void Concentracion(Guardian guardian){
        if (mana>0){
        guardian.setSaludGuardian(guardian.getSaludGuardian()-2);
        this.mana-=1;
        }
        else{
            System.out.println("No le quedan mas puntos de mana");
        }
    }
    
}
