package InicioPantallaVotacion;

public class Persona {
    private String nombreUsuario;
    private String contraseña;

    public Persona(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario='" + nombreUsuario + '\'' + ", contraseña='" + contraseña + '\'' + '}';
    }
}
