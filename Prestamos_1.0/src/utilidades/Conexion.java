
package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {
    

    public static synchronized Connection getConexion() {
        Connection cn;
        try {
            cn = DriverManager.getConnection("jdbc:sqlite:C:\\Bd\\registro.db");
        } catch (SQLException e) {
            cn = null;
            showerrMessage(e.getMessage(),"NotConnection");
        }
        return cn;
    }
    
    public static synchronized void cerrarInstruccion(Statement instruccion) {
        try {
            instruccion.close();
        } catch (SQLException e) {
            showerrMessage(e.getMessage(),"ClosingStatement");
        }
    }

    public static synchronized void cerrarResult(ResultSet rs) {
        try {
            rs.close();
        } catch (SQLException e) {
            showerrMessage(e.getMessage(),"ClosingResulset");
        }
    }
    
    public static synchronized void cerrarConexion(Connection cn) {
        try {
            cn.close();
        } catch (SQLException e) {
            showerrMessage(e.getMessage(),"ClosingConnection");
        }
    }
    
    public static synchronized void deshacerCambios(Connection cn) {
        try {
            cn.rollback();
        } catch (SQLException e) {
            showerrMessage(e.getMessage(),"Rollback");
        }
    }
    
    public static void showerrMessage(String mensaje, String Title){
        JOptionPane.showMessageDialog(null, mensaje, Title, JOptionPane.ERROR_MESSAGE);
    }
}
