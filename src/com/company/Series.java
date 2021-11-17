package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Series {
    public String titulo;
    public String sinopse;
    public int temporada;
    public int episodios;
    public char visualizados;

    Scanner tc = new Scanner(System.in);

    public void LerDados(){
        System.out.println("\nDigite o titulo da série: ");
        titulo = tc.nextLine();

        System.out.println("Digite a sinopse da série: ");
        sinopse = tc.nextLine();

        System.out.println("Digite a quantidade de temporadas da séries: ");
        try{
            temporada = tc.nextInt();
        } catch (Exception io) {
            System.out.println("Função Invalida!");
        }

        System.out.println("Digite o total de episódios: ");
        try{
            episodios = tc.nextInt();
        } catch (Exception io) {
        System.out.println("Função Invalida!");
    }

        System.out.println("Você já assistiu essa Série? Digite 's'(sim) ou 'n'(não):");
        try{
            visualizados = tc.next().charAt(0);
        } catch (Exception io) {
            System.out.println("Função Invalida!");
        }
    }

    public void visualizada() {
        if (visualizados == 's') {
            System.out.println(this.titulo);
        }
    }

    public void naoVisualizada() {
        if (visualizados == 'n') {
            System.out.println(this.titulo);
        }
    }

    public void exibirDados() {
        System.out.println("\n Nome da série: " + this.titulo);
        System.out.println("Sinopse: " + this.sinopse);
        System.out.println("Total de temporadas: " + this.temporada);
        System.out.println("Total de episódios: " + this.episodios);
        System.out.println("Série Assistida: " + this.visualizados + "\n");
    }

    public Series(String nome) { this.titulo = nome; }

    public Series() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return Objects.equals(titulo, series.titulo);
    }

    @Override
    public int hashCode() { return Objects.hash(titulo); }
}
