
package vista.human.ware;

import java.time.LocalDate;


public class Usuario {
    //Atributos 
    private long idUsuario;
    private String nombreUsuario;
    private String contrasenia;
    private String nombre;
    private String email;
    private String telefono;
    private String cuil;
    private String sexo;
    private LocalDate fechaNac;
    
    //Constructor

    public Usuario(long idUsuario, String nombreUsuario, String contrasenia, String nombre, String email,
                            String telefono, String cuil, String sexo, LocalDate fechaNac) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.cuil = cuil;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
    }

    public Usuario() {
    }
    
    //Get y Set

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", nombre=" + nombre + ", cuil=" + cuil + '}';
    }
    
}
