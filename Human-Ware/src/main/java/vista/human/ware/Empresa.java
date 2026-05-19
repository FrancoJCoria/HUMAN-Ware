
package vista.human.ware;

public class Empresa {
    //atributos
    private int idEmpresa;
    private String nombre;
    private String correo;
    private String telefono;

    //constructor
    public Empresa (int idEmpresa, String nombre, String correo, String telefono){
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono; 
    }
//get y set
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
