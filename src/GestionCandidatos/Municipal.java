package GestionCandidatos;

public class Municipal {
    private String nombre;
    private String apellido;
    private String dni;
    private String partidoPolitico;
    private int id;

    // Constructor
    public Municipal(String dni, String nombre, String apellido, String partidoPolitico) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.partidoPolitico = partidoPolitico;
    }
    
    // Métodos getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
}

