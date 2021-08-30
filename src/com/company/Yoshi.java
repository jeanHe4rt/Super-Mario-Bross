package com.company;

public class Yoshi extends Personagem {

    private int qtFrutasComidas;

    public Yoshi(String nome, double altura, int idade){
        super("Yoshi",5,31);
    }

    @Override
    public void revigorar() {
        setEstamina(100);
    }

    @Override
    public void morrer(){
        int vidas = getQtVidas() -1;
        setEstamina(0);
        if(getQtVidas()  < 0){
            setQtVidas(0);
        }else{
            revigorar();
        }
    }

    @Override
    public void coletarMoedas(){
        int moedasColetadas = getQtMoedas()+1;

        if(getQtMoedas() % 10 == 0){
            setQtMoedas(moedasColetadas+1);
        }
    }

    @Override
    public void imprimeCaracteristicas(){
        System.out.println("Personagem:{" +
                "nome='" + getNome() + '\'' +
                ", altura=" +getAltura() +
                ", idade=" + getIdade() +
                ", estamina= "+ getEstamina() +
                ", Moedas= "+ getQtMoedas() +
                "}");
    }

    @Override
    public void imprimePoderes() {
        System.out.println("Salto Flutuante, Devorar, Fusão.");
    }

    @Override
    public void saltar() {
        double tSalto;
        if (getNome().equals("Mario")) {
            tSalto = (getAltura()*0.5);
            System.out.println("Altura do Salto = " + tSalto + "!");
        } else if(getNome().equals("Luigi")){
            tSalto = (getAltura()*getAltura());
            System.out.println("Altura do Salto = " + tSalto + "!");
        }
    }

    @Override
    public void perderEstamina(){
        int estaminaAtual = getEstamina();
        if (estaminaAtual > 0) {
            estaminaAtual = getEstamina()-10;
        }
        if (estaminaAtual <  0) {
            estaminaAtual=0;
        }

        setEstamina(estaminaAtual);
    }

    @Override
    public void addEstamina(){
        int estaminaAtual = getEstamina();
        if (estaminaAtual < 100) {
            estaminaAtual = estaminaAtual + 5;
        }

        if (estaminaAtual >  100) {
            estaminaAtual=1000;
        }

        setEstamina(estaminaAtual);
    }

    @Override
    public void comerCogumelo(){
        double alturaAtual = getAltura();

        setAltura(alturaAtual* getAltura());
    }

    @Override
    public void reverseCogumelo(){
        double alturaAtual = getAltura();

        setAltura(alturaAtual/2);
    }

    public int getQtFrutasComidas() {
        return qtFrutasComidas;
    }

    public void setQtFrutasComidas(int qtFrutasComidas) {
        this.qtFrutasComidas = qtFrutasComidas;
    }


}
