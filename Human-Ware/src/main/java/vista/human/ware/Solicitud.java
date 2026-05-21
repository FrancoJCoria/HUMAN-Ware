
package vista.human.ware;

import java.time.LocalDate;

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
