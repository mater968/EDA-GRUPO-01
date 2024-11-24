package miembrosMesa;

public class Miembro {

    private String dni;
    private String nombre;
    private String apellidos;
    private Tipo tipo;
    private String clave;
    private int id; // Campo para ID
    private String mesa; // Número de mesa

    // Constructor completo
    public Miembro(String dni, String nombre, String apellidos, Tipo tipo, String clave, String mesa) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipo = tipo;
        this.clave = clave;
        this.mesa = mesa;
    }

    // Constructor sin mesa (opcional)
    public Miembro(String dni, String nombre, String apellidos, Tipo tipo, String clave) {
        this(dni, nombre, apellidos, tipo, clave, null); // Llama al constructor completo con `mesa` nula
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }
}