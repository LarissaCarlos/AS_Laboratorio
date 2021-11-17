package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner tc = new Scanner(System.in);

        ArrayList<Series> catalogo = new ArrayList<Series>();
        int op = 0;

        do{
            System.out.println("---------------------------");
            System.out.println("Digite 1 para ADICIONAR suas séries");
            System.out.println("Digite 2 para LISTAR suas séries");
            System.out.println("Digite 3 para REMOVER séries");
            System.out.println("Digite 4 para PROCURAR série por nome");
            System.out.println("Digite 5 para EXIBIR o total de séries no catalogo");
            System.out.println("Digite 0 para SAIR");

            op=tc.nextInt();

            switch (op){

                case 1: {
                    Series serie = new Series();
                    serie.LerDados();
                    catalogo.add(serie);
                    break;
                }
                    
                case 2: {
                    System.out.println("\nSéries Vistas: ");
                    for (int i = 0; i < catalogo.size(); i++) {
                        catalogo.get(i).visualizada();
                    }
                    System.out.println("\nSéries não visualizadas:");
                    for (int i = 0; i < catalogo.size(); i++) {
                        catalogo.get(i).naoVisualizada();
                    }
                    break;
                }

                case 3: {
                    System.out.println("\nDigite a série a ser apagada:");
                    int posicao = tc.nextInt();
                    Series apagar = catalogo.remove(posicao);
                    if(apagar!=null){
                        System.out.println("Série REMOVIDA: " + apagar.titulo);
                    }else{
                        System.out.println("Nao encontrei");
                    }
                    break;
                }

                case 4: {
                    System.out.println("\nDigite a série que deseja: ");
                    String nome = tc.nextLine();
                    nome.split(" ").toString();

                    Series buscar = new Series(nome);

                    if (catalogo.contains(buscar)) {
                        System.out.println("\n Série encontrada " + nome + "na posição: " + catalogo.indexOf(buscar));
                        catalogo.get(catalogo.indexOf(buscar)).exibirDados();
                    }else {
                        System.out.println("\nA série não se encontra no catalogo");
                    }
                    break;
                }

                case 5: {
                    System.out.println("\nSéries cadastradas: " + catalogo.size());
                }

            }
        }while (op!=0);

        System.out.println("\nSéries no catalogo: ");
        for (int i = 0; i<catalogo.size(); i++){
            catalogo.get(i).exibirDados();
        }

    }

}
