/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_felipelin;

/**
 *
 * @author felipelinzhao
 */
public class SuperHeroe extends Heroe {

    private String nombre;

    public SuperHeroe() {
    }

    public SuperHeroe(String nombre, String poder, String deblilidad, Escuadrones team, int fuerza, int agilidad, int mente) {
        super(poder, deblilidad, team, fuerza, agilidad, mente);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
