import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Menitoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Java em 24hrs");
        curso1.setCargaHoraria(24);
        System.out.println(curso1);
        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Javascript em 24hrs");
        curso2.setCargaHoraria(24);
        System.out.println(curso2);
        Menitoria mentoria1 = new Menitoria("Mentoria Java","descricao", LocalDate.now());
        System.out.println(mentoria1);
    }
}
