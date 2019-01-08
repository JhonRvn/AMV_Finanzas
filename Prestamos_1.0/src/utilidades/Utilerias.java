
package utilidades;

import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Utilerias {
    
    public String DateToString(Date fech) {
        /*
            Convertir una fecha en formato Date a String para guardar en DB.
        */
        String NuevaFecha="";
        try{ 
            String formato = "dd-MM-yyyy";
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            NuevaFecha = String.valueOf(sdf.format(fech));
        } catch (Exception e){
        }
        return NuevaFecha;
    }
    
    public Date StringtoDate(String fecha) {
        Date fe=null;
        try
        { 
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");            
            fe = formatoDelTexto.parse(fecha); 
        } catch (Exception e){}
        return fe;
    }
    
    public void RestablecerContenedor(JPanel contenedor)
    {
        for(int i=0; contenedor.getComponents().length>i;i++) {
            if(contenedor.getComponents()[i]instanceof JTextField) {
                ((JTextField)contenedor.getComponents()[i]).setText("");
            }
            if(contenedor.getComponents()[i]instanceof JComboBox) {
                ((JComboBox)contenedor.getComponents()[i]).setSelectedIndex(0);
            }
            if(contenedor.getComponents()[i]instanceof JTextArea) {
                ((JTextArea)contenedor.getComponents()[i]).setText("");
            }
            if(contenedor.getComponents()[i]instanceof JDateChooser){
                ((JDateChooser)contenedor.getComponents()[i]).setDate(null);
            }
        }
    }
    
    public boolean validacion(String Pregunta) {
        boolean procesar=false;
        int seleccion = JOptionPane.showOptionDialog(null,Pregunta,"Seleccione una opción", // Título
        JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] { "Si", "No"}, "Si");
        if (seleccion != -1)
        {
            if((seleccion + 1)==1)
                procesar=true;
            else
                procesar=false;
        }
        return procesar;
    }
}
