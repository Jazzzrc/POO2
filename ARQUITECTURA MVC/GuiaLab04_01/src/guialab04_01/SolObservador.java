/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guialab04_01;

/**
 *
 * @author Favio
 */
public class SolObservador extends Observador{
    
    private float valorCambio = (float)3.81;
    
    public SolObservador(Sujeto sujeto){
        this.setSujeto(sujeto);
        this.getSujeto().agregar(this);
    }
    @Override
    public void actualizar() {
       System.out.println("Observador SOL: " + (this.getSujeto().getMonto()*valorCambio));
    }
    
}
