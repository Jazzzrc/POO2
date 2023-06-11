/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejempl04_json;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author ALUMNO
 */
public class Ejempl04_JSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gson gson = new Gson();
        
        String contenido = "";
        
        try{
            File archivo = new File("datos4.json");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            
            while((linea = br.readLine())!=null){
                contenido +=linea;
            }
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        Persona persona = gson.fromJson(contenido, Persona.class);
        
        System.out.println(persona);
    }
    
}
