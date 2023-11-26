package aplicacion;

import java.math.BigDecimal;
import java.time.LocalDate;
import dominio.*;

public class Principal {
    public static void main(String[] args) {
        BandaMusica bd = new BandaMusica("Banda de Música de Villar del Monte");

        Actuacion act1 = new Actuacion(LocalDate.of(2019, 11, 25));
        bd.agregarActuacion(act1);

        Director dir = new Director("José García López");
        act1.agregarParticipante(dir);

        MusicoSocio msc1 = new MusicoSocio("Antonio López Suárez", "clarinete", 28534);
        act1.agregarParticipante(msc1);

        MusicoRefuerzo msr1 = new MusicoRefuerzo("Juan Jaén Bernal", "tuba", new BigDecimal(121));
        act1.agregarParticipante(msr1);

        Actuacion act2 = new Actuacion(LocalDate.of(2019, 12, 16));
        bd.agregarActuacion(act2);

        MusicoRefuerzo msr2 = new MusicoRefuerzo("María López Gil", "oboe", new BigDecimal(130));
        act2.agregarParticipante(dir);
        act2.agregarParticipante(msc1);
        act2.agregarParticipante(msr2);

        System.out.println(bd);
    }
}
