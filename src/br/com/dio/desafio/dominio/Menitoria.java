package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Menitoria extends Conteudo{
    private LocalDate data;

    public Menitoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nTítulo: " + super.getTitulo() +
                "\nDescricao: " + super.getDescricao() +
                "\nData: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO+20;
    }
}
