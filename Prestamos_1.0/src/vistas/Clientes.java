
package vistas;

import java.awt.HeadlessException; 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane; 
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JInternalFrame {
    
    public modelo.ModeloCliente cliente;
    public controlador.ControladorCliente cc;
    public utilidades.Utilerias utils; 
    
    private DefaultTableModel modeloTabla;

    public Clientes() {
        initComponents();
        this.cliente = new modelo.ModeloCliente();
        this.cc = new controlador.ControladorCliente();
        this.utils = new utilidades.Utilerias();
        this.modeloTabla = this.cc.datatable("");
        this.ClientesDB();
        this.tablaClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_evt) {
                JTable table =(JTable) Mouse_evt.getSource();
                if (JchbMover.isSelected()){
                    if (Mouse_evt.getClickCount() == 1) {
                        leerFila(tablaClientes);
                    }
                }                
            }
        });
        this.JTFIdCliente.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Formulario = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        JbtnGuardar = new javax.swing.JButton();
        JbtnModificar = new javax.swing.JButton();
        JbtnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JtfPrimerNombre = new javax.swing.JTextField();
        JtfSegundoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JtfprimerApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JtfsegundoApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTFIdCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        JtfTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        JchbMover = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        JtfBusqueda = new javax.swing.JTextField();

        setClosable(true);

        Formulario.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setRollover(true);

        JbtnGuardar.setText("Guardar");
        JbtnGuardar.setFocusable(false);
        JbtnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnGuardar.setNextFocusableComponent(JbtnModificar);
        JbtnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(JbtnGuardar);

        JbtnModificar.setText("Modificar");
        JbtnModificar.setFocusable(false);
        JbtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JbtnModificar.setNextFocusableComponent(JbtnEliminar);
        JbtnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(JbtnModificar);

        JbtnEliminar.setText("Eliminar");
        JbtnEliminar.setFocusable(false);
        JbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(JbtnEliminar);

        jLabel1.setText("Primer Nombre");

        JtfPrimerNombre.setNextFocusableComponent(JtfSegundoNombre);

        JtfSegundoNombre.setNextFocusableComponent(JtfprimerApellido);

        jLabel2.setText("Segundo Nombre");

        JtfprimerApellido.setNextFocusableComponent(JtfsegundoApellido);

        jLabel4.setText("Primer Apellido");

        JtfsegundoApellido.setNextFocusableComponent(dcFechaNacimiento);

        jLabel5.setText("Segundo Apellido");

        jLabel6.setText("Cliente");

        JTFIdCliente.setNextFocusableComponent(JtfPrimerNombre);

        jLabel3.setText("Fecha Nacimiento");

        dcFechaNacimiento.setDateFormatString("dd-MM-yyyy");
        dcFechaNacimiento.setNextFocusableComponent(JtfTitulo);

        jLabel7.setText("Titulo");

        JtfTitulo.setNextFocusableComponent(JbtnGuardar);

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        JchbMover.setSelected(true);
        JchbMover.setText("Mover al Seleccionar");

        jLabel8.setText("Buscar");

        JtfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JtfBusquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout FormularioLayout = new javax.swing.GroupLayout(Formulario);
        Formulario.setLayout(FormularioLayout);
        FormularioLayout.setHorizontalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtfsegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JtfPrimerNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(JtfSegundoNombre)
                            .addComponent(JtfprimerApellido)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(JtfTitulo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(JtfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JchbMover)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        FormularioLayout.setVerticalGroup(
            FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FormularioLayout.createSequentialGroup()
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfprimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtfsegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JtfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JchbMover))
                    .addComponent(JtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Formulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnGuardarActionPerformed
        querywriteDB(1);
    }//GEN-LAST:event_JbtnGuardarActionPerformed

    private void JbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnModificarActionPerformed
        querywriteDB(2);
    }//GEN-LAST:event_JbtnModificarActionPerformed

    private void JbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnEliminarActionPerformed
        querywriteDB(3);
    }//GEN-LAST:event_JbtnEliminarActionPerformed

    private void JtfBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JtfBusquedaKeyReleased
        this.modeloTabla = this.cc.datatable(this.JtfBusqueda.getText());
        this.ClientesDB();
    }//GEN-LAST:event_JtfBusquedaKeyReleased

    private void ClientesDB(){
        try{
            this.tablaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.tablaClientes.getTableHeader().setReorderingAllowed(false);
            this.tablaClientes.setModel(this.modeloTabla); 
            this.ajustarColumna(this.tablaClientes,0,150);
            this.ajustarColumna(this.tablaClientes,1,130);
            this.ajustarColumna(this.tablaClientes,2,130);
            this.ajustarColumna(this.tablaClientes,3,130);
            this.ajustarColumna(this.tablaClientes,4,130);
            this.ajustarColumna(this.tablaClientes,5,150);
            this.ajustarColumna(this.tablaClientes,6,100);
            this.tablaClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        }catch(Exception err){
            showMessage(err.getMessage(),"Error al ejecutar",0);  
        } 
    }

    private modelo.ModeloCliente getObjeto() {
        cliente.setCliente(this.JTFIdCliente.getText());
        cliente.setPrimerNombre(this.JtfPrimerNombre.getText());
        cliente.setSegundoNombre(this.JtfSegundoNombre.getText());
        cliente.setPrimerApellido(this.JtfprimerApellido.getText());
        cliente.setSegundoApellido(this.JtfsegundoApellido.getText());
        cliente.setFecha_nacimiento(this.utils.DateToString(this.dcFechaNacimiento.getDate()));
        cliente.setTitulo(this.JtfTitulo.getText());
        return cliente;
    }
    
    private void showMessage(String mensaje, String Title, int Tipo){
        if (Tipo == 0){
            JOptionPane.showMessageDialog(null, mensaje, Title, JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, mensaje, Title, JOptionPane.INFORMATION_MESSAGE);
        }        
    }
    
    private void ajustarColumna(JTable tabla, int col, int size ) {
        tabla.getColumn(tabla.getColumnName(col)).setWidth(size);
        tabla.getColumn(tabla.getColumnName(col)).setMinWidth(size);
        tabla.getColumn(tabla.getColumnName(col)).setMaxWidth(size);
    }
    
    public void leerFila(JTable tabla){
        int row = tabla.getSelectedRow();
        this.JTFIdCliente.setEditable(false);
        this.JTFIdCliente.setText(tabla.getValueAt(row, 0).toString());
        this.JtfPrimerNombre.setText(tabla.getValueAt(row, 1).toString());
        this.JtfSegundoNombre.setText(tabla.getValueAt(row, 2).toString());
        this.JtfprimerApellido.setText(tabla.getValueAt(row, 3).toString());
        this.JtfsegundoApellido.setText(tabla.getValueAt(row, 4).toString());
        this.dcFechaNacimiento.setDate(this.utils.StringtoDate(tabla.getValueAt(row, 5).toString()));
        this.JtfTitulo.setText(tabla.getValueAt(row, 6).toString());
    }
    
    private void querywriteDB(int accion){
        try{
            if(this.JTFIdCliente.getText().isEmpty()){
                this.showMessage("Error.No ha especificado el Cliente que desea crear. Favor Verifique","Registro",0); 
            }else{
                if(this.utils.validacion("¿Desea realizar el cambio en la Base de Datos?")){     
                    this.cliente = getObjeto();
                    switch (accion){
                        case 1:
                            if(this.cc.agregar(cliente)){
                                estadoexec();
                            }
                        break;
                        case 2:
                            if(this.cc.modificar(cliente)){
                                estadoexec();
                            }
                        break;
                        case 3:
                            if(this.cc.eliminar(cliente)){
                                estadoexec();
                            }
                        break;
                        default:
                            this.showMessage("Accion No definida 1-Guardar, 2-Modificar, 3-Eliminar","Registro",0); 
                        break;
                    }  
                }
            }             
        }catch(HeadlessException err){
            this.showMessage(err.getMessage(),"Error al Ejecutar",0);  
        }
    }
    
    private void estadoexec(){
        this.modeloTabla = this.cc.datatable("");
        this.ClientesDB();
        this.JTFIdCliente.setEditable(true);
        this.utils.RestablecerContenedor(Formulario);
        this.showMessage("Accion Realizada con Exito","Mantenimiento de Registros",1); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Formulario;
    private javax.swing.JTextField JTFIdCliente;
    private javax.swing.JButton JbtnEliminar;
    private javax.swing.JButton JbtnGuardar;
    private javax.swing.JButton JbtnModificar;
    private javax.swing.JCheckBox JchbMover;
    private javax.swing.JTextField JtfBusqueda;
    private javax.swing.JTextField JtfPrimerNombre;
    private javax.swing.JTextField JtfSegundoNombre;
    private javax.swing.JTextField JtfTitulo;
    private javax.swing.JTextField JtfprimerApellido;
    private javax.swing.JTextField JtfsegundoApellido;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
