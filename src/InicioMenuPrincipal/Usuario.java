package InicioMenuPrincipal;

public class Usuario {
    private static String nombreUsuario;
    private static String contraseña;
    private static String rol;

    public Usuario(String nombreUsuario, String contraseña, String rol) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public static String getRol(){
        return rol;
    }
    
    public  void setRol(String rol){
        this.rol = rol;
    }
    @Override
    public String toString() {
        return "Usuario{" + "nombreUsuario='" + nombreUsuario + '\'' + ", contraseña='" + contraseña + '\'' + ", rol= "+ rol + '}';
    }
}
