import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso();
        Conteudo mentoria1 = new Menitoria();

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Gabriel");
        dev1.inscreverBootcamp(bootcamp1);
        dev1.progredir();
        System.out.println("Conteudos Inscritos"+dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+dev1.getConteudosConcluidos());
        System.out.println("XP: "+dev1.calcularTotalXp());
        Dev dev2 = new Dev();
        dev2.setNome("Jao");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos"+dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos"+dev2.getConteudosConcluidos());
        System.out.println("XP: "+dev1.calcularTotalXp());
    }
}
