/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guialab04_01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Favio
 */
public class Sujeto {
    
    private List<Observador> observadores = new ArrayList<Observador>();
    private float monto;

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
        notificarTodoObservador();
    }
    
    public void agregar(Observador observador){        
        this.observadores.add(observador);
    }

    private void notificarTodoObservador() {
        
        for(int i=0;i<this.observadores.size();i++){
            observadores.get(i).actualizar();
        }
        
    }
    
    
   
    
    
}
