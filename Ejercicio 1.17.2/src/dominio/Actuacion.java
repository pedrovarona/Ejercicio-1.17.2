package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actuacion {
    private LocalDate fecha;
    private List<Participante> participantes;

    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fecha de actuación: ").append(fecha.toString()).append("\n");
        for (Participante participante : participantes) {
            sb.append(participante.toString()).append("\n");
        }
        return sb.toString();
    }
}
