/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jesusarizmendiparcial;

/**
 *
 * @author T-107
 */
public class Evaluacion {
private  String Nombre;
private float Calificacion;

    public Evaluacion() {
    }

    public Evaluacion(String Nombre, float Calificacion) {
        this.Nombre = Nombre;
        this.Calificacion = Calificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(float Calificacion) {
        this.Calificacion = Calificacion;
    }
    
}
