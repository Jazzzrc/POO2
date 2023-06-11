/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guialab04_01;



/**
 *
 * @author Favio
 */
public class PesoMEXObservador extends Observador{

    private float valorCambio = (float)19.44;
    
    public PesoMEXObservador(Sujeto sujeto){
        this.setSujeto(sujeto);
        this.getSujeto().agregar(this);
    }
    @Override
    public void actualizar() {
       System.out.println("Observador Peso Mexicano: " + (this.getSujeto().getMonto()*valorCambio));
    }
    
}
