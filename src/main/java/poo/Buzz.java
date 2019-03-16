package poo;

import java.lang.InterruptedException;
import java.lang.Thread;

public class Buzz {
    int cont = 1;
    //atributos da classe

    private int ligar;
    private int capacete;
    private int botaoFrases;
    private int botaoLaser;
    private int botaoAsas;
    private int botaoBraco;


    //metodos

    public int obterEstadoCapacete() {return capacete; }
    public int obterEstadoBraco() {return botaoBraco; }
    public int obterEstadoFrase() {return botaoFrases; }


    public void AlteraCapacete(int capacete){
        this.capacete = capacete;

        if (capacete == 1){                                         //se o capacete estiver fechado
            System.out.println("Capacete fechado: ");
            System.out.println("\u268A" + "\u25E0" + "\u268A");     //close
        }else{
            System.out.println("Capacete aberto: ");
            System.out.println("\u268A" + "\u25DC" + "\u268A");     //open
        }
    }

    public void botaoLaser(){
        this.botaoLaser = botaoLaser;

        System.out.println("Laser acionado: ");

        for(int i = 0; i < 10 ;i++) {
            System.out.println("\u21A0");                             //imprime "laser"
        }
    }

    public void botaoAsas(){
        this.botaoAsas = botaoAsas;

        System.out.println("Asas abertas: ");
        System.out.println("\u21F7" + "\u1F60"  + "\u21f8");
    }

    public void botaoBraco(int botaoBraco){
        this.botaoBraco = botaoBraco;

        if (botaoBraco == 1){                                          //se o braço estiver esticado
            System.out.println("Dobrar o braço: ");
            System.out.println("\u268A" + "\u25E0" + "\u268A");       //dobra ele
        }else{
            System.out.println("Esticar o braço: ");
            System.out.println("\u268A" + "\u25DC" + "\u268A");       //estica ele
        }

    }

    public void botaoFrases(int botaoFrases){
        this.botaoFrases = botaoFrases;

        if(cont == 7){
            cont = 1;
        }

        try{
        if(cont == 1){
            System.out.println("\u1d16" + "Buzz Lighter ao seu dispor" +"\u1d16" );
            Thread.sleep(2000);
        }else if(cont == 2){
            System.out.println("\u1d16" + "Diario da missao: me infiltrei no território inimigo sem ser detectado" +"\u1d16" );
            Thread.sleep(2000);
        }else if(cont == 3){
            System.out.println("\u1d16" + "Pare!!! Ordeno que pare!" +"\u1d16" );
            Thread.sleep(2000);
        }else if(cont == 4) {
            System.out.println("\u1d16" + "Nunca duvidei de mim mesmo comandante e nao vou começar agora" + "\u1d16");
            Thread.sleep(2000);
        }else if(cont == 5){
            System.out.println("\u1d16" + "Alvo se aproximando" +"\u1d16" );
            Thread.sleep(2000);
        }else{
            System.out.println("\u1d16" + "Comando estelar estou me aproximando da escotilha de fuga,preparar lançamento!" + "\u1d16");
            Thread.sleep(2000);
        }

        }catch (InterruptedException ex) {}

        cont++;

    }

}
