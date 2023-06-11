/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo03_archivosjson;

import com.google.gson.Gson;
import java.io.PrintWriter;

/**
 *
 * @author Favio
 */
public class Ejemplo03_archivosJSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gson gson = new Gson();
        
        Persona persona = new Persona("Jarek","Robles Cespedes",18);
        
        String contenido = gson.toJson(persona);
        
        try{
            PrintWriter writer = new PrintWriter("datos3.json");
            writer.print(contenido);
            writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
