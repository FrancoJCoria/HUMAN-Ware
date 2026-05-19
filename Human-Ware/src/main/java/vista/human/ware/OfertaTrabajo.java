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
    String estado;
    List<OfertaHabilidad> habilidadesRequeridas;

    public OfertaTrabajo(int idOfTrabajo, String tituloDesc, String descripcion, double salarioMin, double salarioMax, String tipoJornada, String oficina, Titulo tituloRequerido, List<OfertaHabilidad> habilidadesRequeridas, String estado) {
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

    public void agregarTituloRequerido(Titulo tituloR) {
      this.tituloRequerido = tituloR;
        System.out.println("El titulo fue añadido con exito!");
    }

    public void agregarHabilidadRequerida(Habilidad habilidad, int nivelMinimo) {
        if (nivelMinimo >= 1 && nivelMinimo <= 5) {
            OfertaHabilidad of = new OfertaHabilidad(habilidad,nivelMinimo);
            this.habilidadesRequeridas.add(of);
        }else{
            System.out.println("Error, El nivel minimo debe ser entre 1 y 5");
        }

    }

    public int getIdOfTrabajo() {
        return idOfTrabajo;
    }

    public String getTituloDesc() {
        return tituloDesc;
    }

   
    public String getDescripcion() {
        return descripcion;
    }


    public double getSalarioMin() {
        return salarioMin;
    }

 
    public double getSalarioMax() {
        return salarioMax;
    }

 

    public String getTipoJornada() {
        return tipoJornada;
    }

 

    public String getOficina() {
        return oficina;
    }

  

    public Titulo getTituloRequerido() {
        return tituloRequerido;
    }

    public String isEstado() {
        return estado;
    }


    public List<OfertaHabilidad> getHabilidadesRequeridas() {
        return habilidadesRequeridas;
    }

    
    

}
