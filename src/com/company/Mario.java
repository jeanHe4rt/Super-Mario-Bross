package com.company;

public class Mario extends Personagem{

    private boolean isMarioYoshi;
    Yoshi yoshi;

    public Mario(String nome, double altura, int idade, boolean isMarioYoshi){
        super("Mario",1.50,46);
        this.isMarioYoshi = false;
    }

    public void montarNoYoshi(Yoshi yoshi){
        if(isMarioYoshi == true){
         System.out.print("Mário já está Montado no " + yoshi.getNome());
        }else {
            setMarioYoshi(true);
        }
    }
    public void revigorar(){
        setEstamina(100);
    }

    public void morrer(){
        int vidas = getQtVidas() -1;
        setEstamina(0);
        if(getQtVidas()  < 0){
            setQtVidas(0);
        }else{
            revigorar();
        }
    }

    public void coletarMoedas(){
        int moedasColetadas = getQtMoedas()+1;

        if(getQtMoedas() % 10 == 0){
            setQtMoedas(moedasColetadas+1);
        }
    }

    public void imprimeCaracteristicas(){
        System.out.println("Personagem:{" +
                "nome='" + getNome() + '\'' +
                ", altura=" + getAltura() +
                ", idade=" + getIdade() +
                ", estamina= "+ getEstamina() +
                ", Moedas= "+ getQtMoedas() +
                ", Vidas= "+ getQtVidas() +
                "}");
    }

    public void imprimePoderes(){
        System.out.println("Super força, Super salto, super velocidade e outros.");
    }

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

    public void comerCogumelo(){
        double alturaAtual = getAltura();

        setAltura(alturaAtual* getAltura());
    }


    public void reverseCogumelo(){
        double alturaAtual = getAltura();

        setAltura(alturaAtual/2);
    }

    public boolean isMarioYoshi() {
        return isMarioYoshi;
    }

    public void setMarioYoshi(boolean marioYoshi) {
        isMarioYoshi = marioYoshi;
    }

}
