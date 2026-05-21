/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.human.ware;

/**
 *
 * @author FRANCO
 */
class Habilidad {
    //Atributos
    private int idHabilidad;
    private String nombre;
    
    //Constructor
    public Habilidad(int idHabilidad, String nombre) {
        this.idHabilidad = idHabilidad;
        this.nombre = nombre;
    }
     //Constructor Vacio
    public Habilidad() {
    }
    
     //Get y Set
    public int getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(int idHabilidad) {
        this.idHabilidad = idHabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    public void mostrarHabilidad(){
        System.out.println("ID: "+ this.idHabilidad + "  " + this.nombre);
    }
    
}
