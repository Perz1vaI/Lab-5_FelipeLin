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
public class Heroe {

    protected String poder;
    protected String deblilidad;
    protected Escuadrones team;
    protected int fuerza;
    protected int agilidad;
    protected int mente;

    public Heroe() {
    }

    public Heroe(String poder, String deblilidad, Escuadrones team, int fuerza, int agilidad, int mente) {
        this.poder = poder;
        this.deblilidad = deblilidad;
        this.team = team;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.mente = mente;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDeblilidad() {
        return deblilidad;
    }

    public void setDeblilidad(String deblilidad) {
        this.deblilidad = deblilidad;
    }

    public Escuadrones getTeam() {
        return team;
    }

    public void setTeam(Escuadrones team) {
        this.team = team;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getMente() {
        return mente;
    }

    public void setMente(int mente) {
        this.mente = mente;
    }

    @Override
    public String toString() {
        return "Heroe{" + "poder=" + poder + ", deblilidad=" + deblilidad + ", team=" + team + ", fuerza=" + fuerza + ", agilidad=" + agilidad + ", mente=" + mente + '}';
    }

}
