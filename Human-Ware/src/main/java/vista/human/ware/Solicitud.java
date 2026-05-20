/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.human.ware;

import java.time.LocalDate;

/**
 *
 * @author FRANCO
 */
class Solicitud {
    private int idSolicitud;
    private LocalDate fechaCreacion;
    private LocalDate fechaContrato;
    private String estado;

    public Solicitud(int idSolicitud, LocalDate fechaCreacion) {
        this.idSolicitud = idSolicitud;
        this.fechaCreacion = fechaCreacion;
        this.fechaContrato = null;
        this.estado = "Activa";
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Solicitud{" + "idSolicitud=" + idSolicitud + ", fechaCreacion=" + fechaCreacion + ", fechaContrato=" + fechaContrato + ", estado=" + estado + '}';
    }
    
    
   
    
    
}
