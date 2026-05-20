/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista.human.ware;

import java.time.LocalDate;

/**
 *
 * @author Noxie-PC
 */
public class TarjetaCobro {
    private int nroDeTarjeta;
    private String titular;
    private LocalDate fechaExpira;
    private String banco;
    private int codSeg;

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
