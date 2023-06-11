/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomvc;

import Controller.Controller;
import Model.Model;
import Vista.Vista;

/**
 *
 * @author Favio
 */
public class EjemploMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Model model = new Model();
        Vista vista = new Vista();
        vista.setVisible(true);
        
        Controller controller = new Controller(vista, model);
        controller.iniciarVista();
        
    }
    
}
