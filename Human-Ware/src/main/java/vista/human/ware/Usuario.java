/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.human.ware;

import java.time.LocalDate;

/**
 *
 * @author Fede-
 */
public class Usuario {
    private long idUsuario;
    private String contraseña;
    public String nombreUsuario;
    public String nombre;
    public String email;
    public String telefono;
    public String cuil;
    public String sexo;
    public LocalDate fechaNac;
    perfilLaboral miPerfilLaboral;

    public Usuario() {
    }

    public Usuario(long idUsuario, String contraseña, String nombreUsuario, String nombre, String email, String telefono, String cuil, String sexo, LocalDate fechaNac) {
        this.idUsuario = idUsuario;
        this.contraseña = contraseña;
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.cuil = cuil;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.miPerfilLaboral = null;
    }
    
    
    public void crearPerfilLaboral(perfilLaboral miPerfilLaboral){
        if(this.miPerfilLaboral == null){
            this.miPerfilLaboral = miPerfilLaboral;
            System.out.println("Se añadio el perfilLaboral al Usuario!");
        }else{
            System.out.println("Ya existe un perfilLaboral con este Usuario");
        }
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String constraseña) {
        this.contraseña = constraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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

    public boolean validarCredenciales(String usuario, String contraseñaEntrada) {
        return this.nombreUsuario.equals(usuario) && this.contraseña.equals(contraseñaEntrada);
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombreUsuario=" + nombreUsuario + ", nombre=" + nombre + ", cuil=" + cuil + '}';
    }
  
  
}
