
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
    private  List<OfertaTrabajo> ofertas; 
    
    //constructor vacio
    public Empresa(){
    }
    
    //constructor
    public Empresa (int idEmpresa, String nombre, String correo, String telefono){
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono; 
        this.ofertas = new ArrayList<OfertaTrabajo>();
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
    
    //Metodos
    public void publicarOferta(OfertaTrabajo oferta){
        if (oferta != null){
            this.ofertas.add(oferta);
            System.out.println("La oferta se publico correctamente"+ this.nombre);
        }
    }

}