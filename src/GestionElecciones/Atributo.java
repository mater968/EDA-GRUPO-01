package GestionElecciones;

public class Atributo {
    private int id;
    private String inicio;
    private String finall;
    private Categoria categoria;
    private String cantidad;

    public Atributo(int id, String inicio, String finall, Categoria categoria, String cantidad) {
        this.id = id;
        this.inicio = inicio;
        this.finall = finall;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFinall() {
        return finall;
    }

    public void setFinall(String finall) {
        this.finall = finall;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
