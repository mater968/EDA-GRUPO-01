package miembrosMesa;

public class ActaElectoralData {

    private String nombre;
    private String partidoPolitico;
    private int votos;
    private int votosBlanco;
    private int votosNulo;

    // Constructor
    public ActaElectoralData(String nombre, String partidoPolitico, int votos, int votosBlanco, int votosNulo) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
        this.votos = votos;
        this.votosBlanco = votosBlanco;
        this.votosNulo = votosNulo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getVotosBlanco() {
        return votosBlanco;
    }

    public void setVotosBlanco(int votosBlanco) {
        this.votosBlanco = votosBlanco;
    }

    public int getVotosNulo() {
        return votosNulo;
    }

    public void setVotosNulo(int votosNulo) {
        this.votosNulo = votosNulo;
    }
}
