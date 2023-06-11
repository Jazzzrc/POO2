/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Favio
 */
public class Model {
    
    private List <Operacion> operaciones = new ArrayList<Operacion>();

    public List<Operacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(List<Operacion> operaciones) {
        this.operaciones = operaciones;
    }
    
    
    public Model(){
        try{
            File archivo = new File ("operaciones.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            
            while((linea=br.readLine())!=null){
                int operador1 = Integer.parseInt(linea);
                String operacion = br.readLine();
                int operador2 = Integer.parseInt(br.readLine());
                int resultado = Integer.parseInt(br.readLine());
                
                Operacion ope = new Operacion(operador1, operador2, operacion, resultado);
                this.operaciones.add(ope);
            }
            fr.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
