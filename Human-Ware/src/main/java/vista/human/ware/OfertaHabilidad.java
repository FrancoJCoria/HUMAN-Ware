/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.human.ware;

/**
 *
 * @author FRANCO
 */
class OfertaHabilidad {
    //Atributos
    private int idOfertaHabilidad;
    private Habilidad habilidad;
    private int nivelMinimo;

    //Constructor
    public OfertaHabilidad(Habilidad habilidad, int nivelMinimo) {
        this.habilidad = habilidad;
        this.nivelMinimo = nivelMinimo;
    }

    public OfertaHabilidad() {
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

    public int getNivelMinimo() {
        return nivelMinimo;
    }

    public void setNivelMinimo(int nivelMinimo) {
        this.nivelMinimo = nivelMinimo;
    }

}
