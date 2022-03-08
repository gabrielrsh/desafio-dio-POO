package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;
    private final NivelDificuldade dificuldade;
    public Curso(NivelDificuldade dificuldade){
        this.dificuldade = dificuldade;
    }

    @Override
    public double calcularXP() {
        switch(dificuldade.getNivelDificuldade()){
            case 0 -> {
                return XP_PADRAO*cargaHoraria + 10;
            }
            case 1 -> {
                return XP_PADRAO*cargaHoraria + 20;
            }
            case 2 -> {
                return XP_PADRAO*cargaHoraria + 30;
            }
            default -> {
                System.out.println("Nivel indefinido");
                return -1;
            }
        }
    }

    public NivelDificuldade getDificuldade() {
        return dificuldade;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\nTítulo: " + super.getTitulo() +
                "\nDescricao: " + super.getDescricao() +
                "\nDificuldade: " + getDificuldade() +
                "\nCargaHoraria: " + cargaHoraria;
    }


}
