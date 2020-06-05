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
    protected double fuerza;
    protected double agilidad;
    protected double mente;

    public Heroe() {
    }

    public Heroe(String poder, String deblilidad, Escuadrones team, double fuerza, double agilidad, double mente) {
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

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(double agilidad) {
        this.agilidad = agilidad;
    }

    public double getMente() {
        return mente;
    }

    public void setMente(double mente) {
        this.mente = mente;
    }

    @Override
    public String toString() {
        return "Heroe{" + "poder=" + poder + ", deblilidad=" + deblilidad + ", team=" + team + ", fuerza=" + fuerza + ", agilidad=" + agilidad + ", mente=" + mente + '}';
    }

}
