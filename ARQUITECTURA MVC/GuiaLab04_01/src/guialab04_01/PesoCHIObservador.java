/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guialab04_01;



/**
 *
 * @author Favio
 */
public class PesoCHIObservador extends Observador{

    private float valorCambio = (float)941.80;
    
    public PesoCHIObservador(Sujeto sujeto){
        this.setSujeto(sujeto);
        this.getSujeto().agregar(this);
    }
    
    @Override
    public void actualizar() {
       System.out.println("Observador Peso Chileno: " + (this.getSujeto().getMonto()*valorCambio));
    }
    
}
