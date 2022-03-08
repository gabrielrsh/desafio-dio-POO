import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso(NivelDificuldade.BASICO);
        curso1.setTitulo("Introdução à linguagem Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso(NivelDificuldade.INTERMEDIARIO);
        curso2.setTitulo("Collections Java");
        curso2.setDescricao("Descricao curso Collections");
        curso2.setCargaHoraria(4);

        Menitoria mentoria1 = new Menitoria();
        mentoria1.setTitulo("Mentoria linguagem Java");
        mentoria1.setDescricao("Descricao mentoria");
        mentoria1.setData(LocalDate.now().plusDays(15));

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao do Bootcamp");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Gabriel");
        dev1.inscreverBootcamp(bootcamp1);
        dev1.progredir();
        System.out.println("Conteudos Inscritos: "+dev1.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos: "+dev1.getConteudosConcluidos());
        System.out.println("Dev 1 XP: "+dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Jao");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos: "+dev2.getConteudosInscritos());
        System.out.println("\nConteudos Concluidos: "+dev2.getConteudosConcluidos());
        System.out.println("Dev 2 XP: "+dev2.calcularTotalXp());
    }
}
