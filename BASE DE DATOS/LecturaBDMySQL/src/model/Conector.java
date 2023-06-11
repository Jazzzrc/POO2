/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Favio
 */
public class Conector {
    public Conector(){
        List <Estudiante> lstEstudiantes = new ArrayList<Estudiante>();
        try{
            
            String url = "jdbc:mysql://localhost/aprendb5_yachakuycertificados";
            String user = "root";
            String password = "";
            Connection conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Establecida!!!");
            
            Statement consulta = conexion.createStatement();
            ResultSet registro = consulta.executeQuery("SELECT * FROM `tbl_certificate`");
            
            while(registro.next()){
                
                System.out.println("");
                System.out.println("Datos del Participante: ");
                System.out.println("Id: "+registro.getInt("id"));
                System.out.println("Codigo: "+registro.getString("code"));
                System.out.println("Nombre y Apellido: "+registro.getString("name"));
                System.out.println("Curso: "+registro.getString("course"));
                Estudiante estudiante = new Estudiante(registro.getInt("id"), registro.getString("code"),
                        registro.getString("name"),registro.getString("course"));
                lstEstudiantes.add(estudiante);
            }
            conexion.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
