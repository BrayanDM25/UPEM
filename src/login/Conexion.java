/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Brayan
 */
public class Conexion {
    static String bd = "BaseDeDatosFinal";
    //El método getConnection de la clase DriverManager
    //necesita 3 argumentos:
    //url, user y password
    static String url = "jdbc:mysql://localhost/"+bd;
    static String user = "root";
    static String password = "mariobros25";
    
    static public Connection cnx = null;
    
    //Para hacer las consultas
    static public Statement st = null;
    //Para recibir las consultas
    static public ResultSet rs = null;

    //Para realizar consultas preparadas
    static public PreparedStatement pst = null;
    
    public Conexion()
    {
        try 
        {
            //En JDBC4 la siguiente línea no es necesaria
            //No es necesaria, se pone por compatibilidad
            Class.forName("com.mysql.jdbc.Driver");
            
            cnx = DriverManager.getConnection(url,user,password);
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        /*finally
        {
            if(cnx != null)
            {
                try {
                    cnx.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }*/
    }   
    
}
