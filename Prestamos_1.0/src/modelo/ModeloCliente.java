
package modelo;

public class ModeloCliente {
    
    private String  cliente;
    private String  primer_nombre;
    private String  segundo_nombre;
    private String  primer_apellido;
    private String  segundo_apellido;
    private String  fecha_nacimiento;
    private String  titulo;
    
    public ModeloCliente() {
        this.cliente		= "";
        this.primer_nombre 	= "";
        this.segundo_nombre	= "";
        this.primer_apellido 	= "";
        this.segundo_apellido	= "";
        this.fecha_nacimiento	= "";
        this.titulo             = "";
    }

    public ModeloCliente(
    	String  cliente,
        String  primer_nombre,
        String  segundo_nombre,
        String  primer_apellido,
        String  segundo_apellido,
        String  fecha_nacimiento,
        String  titulo
    ) {
        this.cliente		= cliente;
        this.primer_nombre 	= primer_nombre;
        this.segundo_nombre	= segundo_nombre;
        this.primer_apellido 	= primer_apellido;
        this.segundo_apellido	= segundo_apellido;
        this.fecha_nacimiento   = fecha_nacimiento;
        this.titulo             = titulo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPrimerNombre() {
        return primer_nombre;
    }

    public void setPrimerNombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundoNombre() {
        return segundo_nombre;
    }

    public void setSegundoNombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimerApellido() {
        return primer_apellido;
    }

    public void setPrimerApellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundoApellido() {
        return segundo_apellido;
    }

    public void setSegundoApellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }
    
     public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   
}
