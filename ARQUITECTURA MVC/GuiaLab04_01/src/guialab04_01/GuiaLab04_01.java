/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guialab04_01;

/**
 *
 * @author Favio
 */
public class GuiaLab04_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sujeto sujeto = new Sujeto();
        
        new SolObservador(sujeto);

        new PesoCHIObservador(sujeto);
        new PesoMEXObservador(sujeto);
        sujeto.setMonto(100);
    }
    
}
