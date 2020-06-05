/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_felipelin;

import java.util.ArrayList;

/**
 *
 * @author felipelinzhao
 */
public class Escuadrones extends Heroe {

    protected String nombre;
    protected String base;
    protected Heroe lider;
    protected String tipo;
    private ArrayList<Heroe> lista = new ArrayList();

    public Escuadrones() {
    }

    public Escuadrones(String nombre, String base, Heroe lider, String tipo) {
        this.nombre = nombre;
        this.base = base;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Heroe getLider() {
        return lider;
    }

    public void setLider(Heroe lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Heroe> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Heroe> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Lugar: " + base;
    }

}
