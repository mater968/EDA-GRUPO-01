package GestionCandidatos;

import java.util.ArrayList;

public class RegistroCandidatos {
    private static RegistroCandidatos instancia;
    private ArrayList<String> candidatos;

    private RegistroCandidatos() {
        candidatos = new ArrayList<>();
    }

    public static RegistroCandidatos getInstance() {
        if (instancia == null) {
            instancia = new RegistroCandidatos();
        }
        return instancia;
    }

    public void agregarCandidato(String candidato) {
        candidatos.add(candidato);
    }

    public ArrayList<String> obtenerCandidatos() {
        return new ArrayList<>(candidatos);
    }
}

