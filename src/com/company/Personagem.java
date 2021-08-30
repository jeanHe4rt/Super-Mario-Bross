package com.company;

public abstract class Personagem {
    private String nome;
    private double altura;
    private int idade;
    private double tSalto;
    private int estamina;
    private int qtMoedas;
    private int qtVidas;

    public Personagem(String nome, double altura, int idade){
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.estamina = 100;
        this.qtMoedas = 0;
        this.qtVidas = 1;
    }

    public abstract void revigorar();

    public abstract void morrer();

    public abstract void coletarMoedas();

    public abstract void imprimeCaracteristicas();

    public abstract void imprimePoderes();

    public abstract void saltar();

    public abstract void perderEstamina();
    public abstract void addEstamina();

    public abstract void comerCogumelo();

    public abstract void reverseCogumelo();
    public abstract  void crescer();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double gettSalto() {
        return tSalto;
    }

    public void settSalto(double tSalto) {
        this.tSalto = tSalto;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getQtMoedas() {
        return qtMoedas;
    }

    public void setQtMoedas(int qtMoedas) {
        this.qtMoedas = qtMoedas;
    }

    public int getQtVidas() {
        return qtVidas;
    }

    public void setQtVidas(int qtVidas) {
        this.qtVidas = qtVidas;
    }
}
