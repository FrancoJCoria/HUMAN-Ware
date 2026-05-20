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

    private int idOfertaHabilidad;
    private Habilidad habilidad;
    private int nivelMinimo;

    public OfertaHabilidad(Habilidad habilidad, int nivelMinimo) {
        this.habilidad = habilidad;
        this.nivelMinimo = nivelMinimo;
    }

    public Habilidad getHabilidad() {
        return this.habilidad;
    }

    public int getNivelMinimo() {
        return this.nivelMinimo;
    }

    public int getIdOfertaHabilidad() {
        return idOfertaHabilidad;
    }

}
