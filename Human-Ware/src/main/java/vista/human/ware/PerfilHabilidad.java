/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.human.ware;

/**
 *
 * @author FRANCO
 */
public class PerfilHabilidad {

    private int idOfertaHabilidad;
    private Habilidad habilidad;
    private int nivel;

    //Constructor
    public PerfilHabilidad(Habilidad habilidad, int nivel) {
        this.habilidad = habilidad;
        this.nivel = nivel;
    }

    public PerfilHabilidad() {
    }

    //Get  y Set
    public int getIdOfertaHabilidad() {
        return idOfertaHabilidad;
    }

    public void setIdOfertaHabilidad(int idOfertaHabilidad) {
        this.idOfertaHabilidad = idOfertaHabilidad;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
