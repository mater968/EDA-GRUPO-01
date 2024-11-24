package miembrosMesa;

import java.util.List;

public class MesaActa {

    private String numeroMesa;
    private String fecha;
    private String hora;
    private String lugar;
    private List<Miembro> miembros;

    // Constructor
    public MesaActa(String numeroMesa, String fecha, String hora, String lugar, List<Miembro> miembros) {
        this.numeroMesa = numeroMesa;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.miembros = miembros;
    }

    // Getters y Setters
    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<Miembro> miembros) {
        this.miembros = miembros;
    }
}
