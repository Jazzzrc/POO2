/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Favio
 */
public class Controller implements ActionListener{

    private Vista vista;
    private Model model;
    private int contador;
    
    public Controller(Vista vista, Model model){
        
        this.vista = vista;
        this.model = model;
        this.vista.btnCargarDatos.addActionListener(this);
    }
    
    public void iniciarVista(){
        vista.setTitle("Operaciones en MVC");
        
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(contador<model.getOperaciones().size()){
        int operador1 = model.getOperaciones().get(contador).getOperador1();       
        vista.txtOperador1.setText(Integer.toString(operador1));
        
        int operador2 = model.getOperaciones().get(contador).getOperador2();       
        vista.txtOperador2.setText(Integer.toString(operador2));
        
        String operacion = model.getOperaciones().get(contador).getOperacion();       
        vista.txtOperacion.setText(operacion);
        
        int resultado = model.getOperaciones().get(contador).getResultado();       
        vista.txtResultado.setText(Integer.toString(resultado));
        contador++;
    }
        else{
            JOptionPane.showMessageDialog(null, "Ya no hay más datos!!");
        }
        
        
    }
    
}
