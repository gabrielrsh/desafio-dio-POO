package br.com.dio.desafio.dominio;

public enum NivelDificuldade {
    BASICO(0),
    INTERMEDIARIO(1),
    DIFICIL(2);

    private final int nivelDificuldade;

    NivelDificuldade(int nivelDificuldade){
        this.nivelDificuldade = nivelDificuldade;
    }

    public int getNivelDificuldade(){
        return nivelDificuldade;
    }
}
