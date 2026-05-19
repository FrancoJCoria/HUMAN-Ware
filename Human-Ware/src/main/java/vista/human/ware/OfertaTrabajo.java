/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.human.ware;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FRANCO
 */
public class OfertaTrabajo {

    int idOfTrabajo;
    String tituloDesc;
    String descripcion;
    double salarioMin;
    double salarioMax;
    String tipoJornada;
    String oficina;
    Titulo tituloRequerido;
    boolean estado;
    List<OfertaHabilidad> habilidadesRequeridas;

    public OfertaTrabajo(int idOfTrabajo, String tituloDesc, String descripcion, double salarioMin, double salarioMax, String tipoJornada, String oficina, Titulo tituloRequerido, List<OfertaHabilidad> habilidadesRequeridas, boolean estado) {
        this.idOfTrabajo = idOfTrabajo;
        this.tituloDesc = tituloDesc;
        this.descripcion = descripcion;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.tipoJornada = tipoJornada;
        this.oficina = oficina;
        this.tituloRequerido = tituloRequerido;
        this.estado = estado;
        this.habilidadesRequeridas = new ArrayList<>();
    }

    public void agregarRequisitoMinimo(Habilidad habilidad, int puntuacionMinimo) {
    }

    public void agregarTituloRequerido(Titulo tituloR) {

    }

}
