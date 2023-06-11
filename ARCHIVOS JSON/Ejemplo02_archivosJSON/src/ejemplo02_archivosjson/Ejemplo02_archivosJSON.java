/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo02_archivosjson;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Favio
 */
public class Ejemplo02_archivosJSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gson gson = new Gson();
        
        String contenido = "";
        
        try{
            File archivo = new File("datos.json");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            while((linea = br.readLine())!=null){
                contenido += linea;
            }
            fr.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        Persona persona = gson.fromJson(contenido,Persona.class);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellidos: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
    }
    
}
