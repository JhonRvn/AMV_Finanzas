
package controlador;

import javax.swing.table.DefaultTableModel;


public class ControladorCliente {
    
    public Adapter.AdapterCliente clienteadapter;
    
    
    public ControladorCliente() {
        clienteadapter = new Adapter.AdapterCliente();
    }
 
    public DefaultTableModel datatable (String texto){
        return clienteadapter.getDataset(texto);
    }

    public boolean agregar(modelo.ModeloCliente cliente) {
        return clienteadapter.agregar(cliente);
    }
    
    public boolean modificar(modelo.ModeloCliente cliente) {
        return clienteadapter.modificar(cliente);
    }
    
    public boolean eliminar(modelo.ModeloCliente cliente) {
        return clienteadapter.eliminar(cliente);
    }
}
