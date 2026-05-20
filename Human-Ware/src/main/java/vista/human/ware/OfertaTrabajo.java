/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.human.ware;

import java.time.LocalDate;
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
    LocalDate fechaCobertura;
    List<Solicitud> solicitudesRecibidas;

    public OfertaTrabajo(int idOfTrabajo, String tituloDesc, String descripcion, double salarioMin, double salarioMax, String tipoJornada, String oficina) {
        this.idOfTrabajo = idOfTrabajo;
        this.tituloDesc = tituloDesc;
        this.descripcion = descripcion;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
        this.tipoJornada = tipoJornada;
        this.oficina = oficina;
        this.estado = "Pendiente";
        this.habilidadesRequeridas = new ArrayList<>();
        this.solicitudesRecibidas = new ArrayList<>();
    }

    public void agregarTituloRequerido(Titulo tituloR) {
        this.tituloRequerido = tituloR;
        System.out.println("El titulo fue añadido con exito!");
    }

    public void agregarHabilidadRequerida(Habilidad habilidad, int nivelMinimo) {
        if (nivelMinimo >= 1 && nivelMinimo <= 5) {
            OfertaHabilidad of = new OfertaHabilidad(habilidad, nivelMinimo);
            this.habilidadesRequeridas.add(of);
        } else {
            System.out.println("Error, El nivel minimo debe ser entre 1 y 5");
        }

    }

    public void cancelarOferta() {
        this.estado = "Cancelada";
        for(Solicitud solicitud : solicitudesRecibidas) {
            solicitud.setEstado("Inactiva");
        }
    }

    public void comunicarPuestoCubierto(Solicitud solicitudElegida){
        this.estado = "Cubierta";
        this.fechaCobertura = LocalDate.now();
        for(Solicitud solicitud : solicitudesRecibidas) {
            solicitud.setEstado("Inactiva");
            
            if(solicitud.equals(solicitudElegida)){
                solicitud.setFechaContrato(fechaCobertura);
            }
        }
        
        
    }
    
    public void recibirSolicitud(Solicitud nuevaSolicitud){
        if(!solicitudesRecibidas.contains(nuevaSolicitud)){
            solicitudesRecibidas.add(nuevaSolicitud);
            System.out.println("La solicitud fue recibida con exito!");
        }else{
            System.out.println("La solicitud ya existe !");
        }
    }
    
    
    public void verHistorialSolicitudes(){
        for(Solicitud solicitud : solicitudesRecibidas){
            System.out.println(solicitud);
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

    public String getEstado() {
        return estado;
    }

    public List<OfertaHabilidad> getHabilidadesRequeridas() {
        return habilidadesRequeridas;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
