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
public class Escuadrones extends Heroe{

    protected String nombre;
    protected String base;
    protected String lider;
    protected String tipo;
    private ArrayList lista = new ArrayList();

    public Escuadrones() {
    }

    public Escuadrones(String nombre, String base, String lider, String tipo) {
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

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }
    
    

    @Override
    public String toString() {
        return "Escuadrones{" + "nombre=" + nombre + ", base=" + base + ", lider=" + lider + ", tipo=" + tipo + ", lista=" + lista + '}';
    }

}
