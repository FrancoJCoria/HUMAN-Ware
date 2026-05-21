
package vista.human.ware;

import java.time.LocalDate;

public class TarjetaCobro {
    //Atributos
    private int nroDeTarjeta;
    private String titular;
    private LocalDate fechaExpira;
    private String banco;
    private int codSeg;

    //Constructor
    public TarjetaCobro(int nroDeTarjeta, String titular, LocalDate fechaExpira, String banco, int codSeg) {
        this.nroDeTarjeta = nroDeTarjeta;
        this.titular = titular;
        this.fechaExpira = fechaExpira;
        this.banco = banco;
        this.codSeg = codSeg;
    }
   
    //Constructor Vacio
    public TarjetaCobro() {
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public LocalDate getFechaExpira() {
        return fechaExpira;
    }

    public void setFechaExpira(LocalDate fechaExpira) {
        this.fechaExpira = fechaExpira;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getCodSeg() {
        return codSeg;
    }

    public void setCodSeg(int codSeg) {
        this.codSeg = codSeg;
    }

}
