
package Adapter;
import javax.swing.table.DefaultTableModel;


public class AdapterCliente {
    
    utilidades.EjecucionQuerys ejecucionDB;
    
    public AdapterCliente(){
        ejecucionDB = new utilidades.EjecucionQuerys();
    }

    public boolean agregar(modelo.ModeloCliente cliente) {
        String query =
            "Insert Into AMV_Clientes("
            + "Cliente,"
            + "Primer_Nombre,"
            + "Segundo_Nombre," 
            + "Primer_Apellido,"
            + "Segundo_Apellido,"
            + "Fecha_Nacimiento,"
            + "Titulo"
            + ")"
            + "Values("
            + "'"+cliente.getCliente()+"',"
            + "'"+cliente.getPrimerNombre()+"',"
            + "'"+cliente.getSegundoNombre()+"',"
            + "'"+cliente.getPrimerApellido()+"',"
            + "'"+cliente.getSegundoApellido()+"',"
            + "'"+cliente.getFecha_nacimiento()+"',"
            + "'"+cliente.getTitulo()+"'"    
            + ")";
        return this.ejecucionDB.operacion(query);
    }
    
    public boolean modificar(modelo.ModeloCliente cliente) {
        String query =
            "UPDATE AMV_Clientes "
            + "SET "
            + " Primer_Nombre = '"+cliente.getPrimerNombre()+"',"
            + " Segundo_Nombre = '"+cliente.getSegundoNombre()+"'," 
            + " Primer_Apellido = '"+cliente.getPrimerApellido()+"',"
            + " Segundo_Apellido = '"+cliente.getSegundoApellido()+"',"
            + " Fecha_Nacimiento = '"+cliente.getFecha_nacimiento()+"',"
            + " Titulo = '"+cliente.getTitulo()+"'"
            + "WHERE Cliente = '"+cliente.getCliente()+"'";
        return this.ejecucionDB.operacion(query);
    }
    
    public boolean eliminar(modelo.ModeloCliente cliente) {
        String query =
            "DELETE FROM AMV_Clientes WHERE Cliente = '"+cliente.getCliente()+"'";
        return this.ejecucionDB.operacion(query);
    }
  
    public DefaultTableModel getDataset(String text) {
        String findText = "";
        
        if(text.isEmpty()){
            findText = "%";
        }else{
            findText = new StringBuilder("%").append(text).append("%").toString();
        }
        
        String query = ""
                + "SELECT "
                + " c.Cliente,"
                + " c.primer_nombre,"
                + " c.segundo_nombre,"
                + " c.primer_apellido,"
                + " c.segundo_apellido,"
                + " c.fecha_nacimiento,"
                + " c.titulo "
                + "FROM AMV_Clientes c "
                + "WHERE "
                + " c.Cliente LIKE '"+findText+"'"
                + " OR c.primer_nombre LIKE '"+findText+"'"
                + " OR c.segundo_nombre LIKE '"+findText+"'"
                + " OR c.primer_apellido LIKE '"+findText+"'"
                + " OR c.segundo_apellido LIKE '"+findText+"'"
                + " OR c.fecha_nacimiento LIKE '"+findText+"'"
                + " OR c.titulo LIKE '"+findText+"'";
        return ejecucionDB.DataTable(query, 1);
    }
}
