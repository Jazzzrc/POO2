/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Favio
 */
public class Operacion {
    
    /*Declaración de variables*/
    
    private int operador1;
    private int operador2;
    private String operacion;
    private int resultado;

    
    //Contructor 
    
    public Operacion(int operador1, int operador2, String operacion, int resultado) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.operacion = operacion;
        this.resultado = resultado;
    }
    
   
    
    //Metodos de acceso

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
}
