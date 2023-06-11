/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_archivosjson;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;


/**
 *
 * @author Favio
 */
public class Ejemplo_archivosJSON {

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
        
        Properties properties = gson.fromJson(contenido,Properties.class);
        System.out.println(properties.get("nombre"));
        System.out.println(properties.get("apellidos"));
        System.out.println(properties.get("edad"));
        System.out.println(properties.get("******"));
        System.out.println(properties.get(contenido));
    }
    
}
