
package utilidades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EjecucionQuerys {
    
    private Connection cn;
    private Statement st;
    private ResultSet rs;
    
    utilidades.Conexion Conexion;
    utilidades.Utilerias utils;
    DefaultTableModel model;

    public EjecucionQuerys() {
        this.Conexion = new utilidades.Conexion();
        this.utils = new utilidades.Utilerias ();
        this.cn = null;
        this.st = null;
        this.rs = null;
    }
        
    public boolean operacion (String sqlquery) {
        boolean realizado = false;
        try {
            cn = Conexion.getConexion();
            st = cn.createStatement();            
            st.execute(sqlquery);
            Conexion.cerrarInstruccion(st);
            Conexion.cerrarConexion(cn);
            realizado = true;
        } catch (SQLException e) {
            Conexion.cerrarInstruccion(st);
            Conexion.cerrarConexion(cn);
            this.showerrMessage(e.getMessage(), "Error QueryExec");
        }
        return realizado;
    }
   
    public DefaultTableModel DataTable(String sql, int tipo) {
        try 
        {
            cn = Conexion.getConexion();
            if(cn!=null)
            {
                String titulos [];
                String Fila [];
                st = cn.createStatement();
                rs = st.executeQuery(sql);                
                switch(tipo)                
                {
                    case 1://Modelo Tabla Clientes
                        titulos = new String[]{
                            "Cliente", 
                            "PrimerNombre",
                            "SegundoNombre",
                            "PrimerApellido",
                            "SegundoApellido",
                            "FechaNacimiento",
                            "Titulo"
                        };
                        model = new DefaultTableModel(null, titulos);
                        Fila = new String[7];
                        while (rs.next()) {
                            Fila[0] = rs.getString("Cliente");
                            Fila[1] = rs.getString("primer_nombre");
                            Fila[2] = rs.getString("segundo_nombre");
                            Fila[3] = rs.getString("primer_apellido");
                            Fila[4] = rs.getString("segundo_apellido");
                            Fila[5] = rs.getString("fecha_nacimiento");
                            Fila[6] = rs.getString("titulo");
                            model.addRow(Fila);
                        }
                    break;
                }
            }
        } catch (SQLException e) {
            this.showerrMessage("Se produjo un error al cargar los datos " + e.getMessage(), "Error DataSet");
        }finally {
            Conexion.cerrarResult(rs);
            Conexion.cerrarInstruccion(st);
            Conexion.cerrarConexion(cn);
        }
        return model;
    }
    
    public void showerrMessage(String mensaje, String Title){
        JOptionPane.showMessageDialog(null, mensaje, Title, JOptionPane.ERROR_MESSAGE);
    }
}
