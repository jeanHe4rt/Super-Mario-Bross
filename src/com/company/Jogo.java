package com.company;
import java.util.Random;

public class Jogo {

    private Personagem jogador1;
    private  Personagem jogador2;


    public Jogo(Personagem jogador1, Personagem jogador2){
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void jogar(){

        Random r1 = new Random();
        int countJ1 = r1.nextInt(30);
        int countJ2 = r1.nextInt(30);;

        for(int x = 0; x<countJ1;x++){
            jogador1.coletarMoedas();
        }

        for(int x = 0; x<countJ2;x++){
            jogador2.coletarMoedas();
        }


        System.out.println("\nQuantidade de moedas coletadas: " + countJ1+ ";" );
        System.out.println("\nResultado Jogador 1: ");
        jogador1.imprimeCaracteristicas();


        System.out.println("\nQuantidade de moedas coletadas: "+ countJ2+";");
        System.out.println("\nResultado Jogador 2: ");
        jogador2.imprimeCaracteristicas();

    }

    public void imprimePersonagem() {
        System.out.println(
                "Personagem 1:{" +
                "nome='" + jogador1.getNome() + '\'' +
                ", altura=" + jogador1.getAltura() +
                ", idade=" + jogador1.getIdade() +
                ", estamina= "+ jogador1.getEstamina() +
                "}\n\n"
                + "Personagem 2:{" +
                        "nome='" + jogador2.getNome() + '\'' +
                        ", altura=" + jogador2.getAltura() +
                        ", idade=" + jogador2.getIdade() +
                        ", estamina= "+ jogador2.getEstamina() +
                        "}\n\n"
                );

    }

    public Personagem getJogador1() {
        return jogador1;
    }

    public void setJogador1(Personagem jogador1) {
        this.jogador1 = jogador1;
    }

    public Personagem getJogador2() {
        return jogador2;
    }

    public void setJogador2(Personagem jogador2) {
        this.jogador2 = jogador2;
    }

}
