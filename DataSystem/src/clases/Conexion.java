package clases;

import java.sql.*;

public class Conexion {
    //conexion local a base de datos

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_ds", "root", "");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en conexión local " + e);
        }
        return (null);
    }

    public static PreparedStatement buscarEquipo(String buscar) {
        try {
            Connection cn =conectar();
        if (buscar.equals("Todos")) {
            PreparedStatement pst = cn.prepareStatement("select num_serie,tipo_equipo,marca,estatus from equipos");
            return pst;
        } else{
            PreparedStatement pst = cn.prepareStatement("select num_serie,tipo_equipo,marca,estatus from equipos where estatus ='" + buscar + "'");
            return pst;
        } 
        } catch (SQLException e) {
        }return null;
    }
}
