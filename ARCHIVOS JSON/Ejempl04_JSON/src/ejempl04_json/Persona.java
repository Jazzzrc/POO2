/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejempl04_json;

import java.util.ArrayList;

/**
 *
 * @author ALUMNO
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private ArrayList<Asignatura> asignaturas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Datos de la Persona" + 
                "\nnombre:" + nombre + 
                "\napellidos:" + apellidos + 
                "\nedad:" + edad + 
                "\nAsignaturas matriculado: " + 
                "\n"+asignaturas;
    }
    
    
}
