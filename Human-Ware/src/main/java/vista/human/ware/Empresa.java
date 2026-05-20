package vista.human.ware;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    //atributos
    private int idEmpresa;
    private String nombre;
    private String correo;
    private String telefono;
    private TarjetaCobro tarjeta;
    private List<OfertaTrabajo> ofertasLaborales;

    //constructor vacio
    public Empresa() {
    }

    //constructor
    public Empresa(int idEmpresa, String nombre, String correo, String telefono) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.ofertasLaborales = new ArrayList<OfertaTrabajo>();
        this.tarjeta = new TarjetaCobro();
    }
//get y set

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTarjeta(TarjetaCobro tarjeta) {
        this.tarjeta = tarjeta;
    }

    //Metodos
    public void publicarOferta(OfertaTrabajo oferta) {
        if (oferta != null) {
            this.ofertasLaborales.add(oferta);
            oferta.setEstado("Publicada");
            System.out.println("La oferta se publico correctamente" + this.nombre);
        }
    }

    public void cancelarOferta(OfertaTrabajo oferta) {
        if (this.ofertasLaborales.contains(oferta)) {
            oferta.cancelarOferta();
            System.out.println("Oferta de trabajo Cancelada: " + oferta.getIdOfTrabajo());
        } else {
            System.out.println("Error: La oferta de trabajo no esta registrada.");
        }
    }

    public void puestoCubierto(OfertaTrabajo oferta, Solicitud solicitudElegida) {
        if (this.ofertasLaborales.contains(oferta) && oferta.getEstado().equals("Publicada")) {
            oferta.comunicarPuestoCubierto(solicitudElegida);
            System.out.println("Se comunica  que la oferta : " + oferta.getIdOfTrabajo() + "fue cubierta");
        } else {
            System.out.println("Error: La oferta de trabajo no esta registrada");
        }
    }

}
