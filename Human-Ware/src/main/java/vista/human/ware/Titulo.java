
package vista.human.ware;

class Titulo {

    private int idTitulo;
    private String nombreTitulo;
    private String tipo;
    private String universidad;

    public Titulo(int idTitulo, String nombreTitulo, String tipo, String universidad) {
        this.idTitulo = idTitulo;
        this.nombreTitulo = nombreTitulo;
        this.tipo = tipo;
        this.universidad = universidad;
    }

    public int getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(int idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getNombreTitulo() {
        return nombreTitulo;
    }

    public void setNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}
