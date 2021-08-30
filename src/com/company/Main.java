package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*Personagem personagem = new Personagem("",0 ,0);
        personagem.setNome("Mario");
        personagem.setAltura(1.52);
        personagem.setIdade(46);

        Personagem p2 = new Personagem("",0 ,0 );

        p2.setNome("Luigi");
        p2.setAltura(2);
        p2.setIdade(50);

        p2.saltar();
        personagem.saltar();

        personagem.imprimeCaracteristicas();

        p2.perderEstamina();
        p2.imprimeCaracteristicas();

        p2.comerCogumelo();

        p2.imprimeCaracteristicas();

        p2.reverseCogumelo();

        p2.imprimeCaracteristicas();*/

        //Jogo j1 = new Jogo(personagem,p2);

        //j1.imprimePersonagem();

        //j1.jogar();

        Mario m1 = new Mario();
        Luigi l1 = new Luigi();
        Yoshi y1 = new Yoshi();

        m1.montarNoYoshi(y1);
        m1.imprimeCaracteristicas();
        y1.comerFruta();
        y1.getVelocidade();

        y1.comerFruta();
        y1.imprimeCaracteristicas();
        y1.comerFruta();
        y1.imprimeCaracteristicas();

        l1.voar();
        l1.imprimeCaracteristicas();

        m1.crescer();
        l1.crescer();
        y1.crescer();

        m1.saltar();
        m1.saltar(2);

    }
}
