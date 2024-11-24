package GestionCandidatos;

public class Presidente {
    private String dni;
    private String nombre;
    private String apellido;
    private String partidoPolitico;

    public Presidente(String dni, String nombre, String apellido, String partidoPolitico) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.partidoPolitico = partidoPolitico;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
}

