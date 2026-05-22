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
class perfilLaboral {

    private int idPostulante;
    private double reMinima;
    private String tipoJornada;
    private boolean dispoViaje;
    private String vehiculo;
    private Titulo titulo;
    private List<PerfilHabilidad> misHabilidades;
    private List<Solicitud> misSolicitudes;

    public perfilLaboral(int idPostulante, double reMinima, String tipoJornada, boolean dispoViaje, String vehiculo, Titulo titulo) {
        this.idPostulante = idPostulante;
        this.reMinima = reMinima;
        this.tipoJornada = tipoJornada;
        this.dispoViaje = dispoViaje;
        this.vehiculo = vehiculo;
        this.titulo = titulo;
        this.misHabilidades = new ArrayList<>();
        this.misSolicitudes = new ArrayList<>();
    }

    public void agregarHabilidad(Habilidad habilidad, int nivel) {
        if (nivel >= 1 && nivel <= 5 && !this.misHabilidades.contains(new PerfilHabilidad(habilidad, nivel))) {
            this.misHabilidades.add(new PerfilHabilidad(habilidad, nivel));
        } else {
            System.out.println("Error, El nivel minimo debe ser entre 1 y 5 o la habilidad ya existe");
        }
    }

    public void mostrarSolicitudes() {
        for (Solicitud solicitud : misSolicitudes) {
            System.out.println(solicitud);
        }
    }

}
