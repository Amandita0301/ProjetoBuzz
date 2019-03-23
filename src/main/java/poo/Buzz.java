package poo;

import java.lang.InterruptedException;
import java.lang.Thread;

public class Buzz {

    //atributos da classe
    private int capacete;
    private int botaoFrases;
    private int botaoLaser;
    private int botaoAsas;
    private int botaoBraco;
    int cont = 1;


    //metodos

    public void alteraCapacete(int Capacete) {
        this.capacete = Capacete;

        if(capacete == 1) {
            System.out.println("Capacete fechado: ");
            System.out.println();
            System.out.println("\u268A" + "\u25E0" + "\u268A");     //close
            System.out.println();
        }else if(capacete == 2) {
            System.out.println();
            System.out.println("Capacete aberto: ");
            System.out.println("\u268A" + "\u25DC" + "\u268A");     //open
            System.out.println();
        }else{
            System.out.println("Opção Inválida:");
        }
    }

    public void alteraLaser(int Laser){
        this.botaoLaser = Laser;

        if(botaoLaser == 1) {
            System.out.println("Laser acionado: ");
            System.out.println();
            System.out.println("      " + "\u0040");                                      //LINHA 1
            System.out.print("  " + "\u22F1" + "\u22F0" + "\u0040" + "\u0040" + "\u22F1" + "\u22F0");     //LINHA 2
            for (int i = 0; i < 45; i++) {
                System.out.print("\u21A0");                             //imprime "laser"
            }
            System.out.println();
            System.out.println("     " + "\u0040" + "\u0040");
            System.out.println("     " + "\u0040" + "\u0040");
            System.out.println();
        }else if (botaoLaser == 2){
            System.out.println("Laser apagado: ");
            System.out.println();
            System.out.println("      " + "\u0040");                                      //LINHA 1
            System.out.print("  " + "\u22F1" + "\u22F0" + "\u0040" + "\u0040" + "\u22F1" + "\u22F0");     //LINHA 2
            System.out.println();
            System.out.println("     " + "\u0040" + "\u0040");
            System.out.println("     " + "\u0040" + "\u0040");
        }else{
            System.out.println("Opção Inválida:");
        }
    }

    public void alteraAsas(int Asas) {
        this.botaoAsas = Asas;

        if(botaoAsas ==1) {
            System.out.println("Asas abertas: ");
            System.out.println();
            System.out.println("     " + "\u0040");
            System.out.println(" " + "\u21F7" + "\u21F7" + "\u22F0" + "\u0040" + "\u0040" + "\u22F1" + "\u21F7" + "\u21f8");     //LINHA 2
            System.out.println(" " + "\u22F0" + "  " + "\u0040" + "\u0040" + "  " + "\u22F1");
            System.out.println("     " + "\u0040" + "\u0040");
            System.out.println("     " + "\u0040" + "\u0040");
            System.out.println();
        }else if (botaoAsas == 2) {
            System.out.println("Asas fechadas: ");
            System.out.println();
            System.out.println("     " + "\u0040");                                          //LINHA 1
            System.out.println("   " + "\u22F0" + "\u0040" + "\u0040" + "\u22F1");             //LINHA 2
            System.out.println(" " + "\u22F0" + " " + "\u21DF" + "\u0040" + "\u0040" + "\u21DF" + " " + "\u22F1");                    //linha3
            System.out.println("    " + "\u21DF" + "\u0040" + "\u0040" + "\u21DF");
            System.out.println("    " + "\u21DF" + "\u0040" + "\u0040" + "\u21DF");
            System.out.println();
        }else{
            System.out.println("Opção Inválida:");
        }
    }


    public void alteraBraco(int Braco){
        this.botaoBraco = Braco;

        if(botaoBraco == 1) {
            System.out.println("Dobrar o braço: ");
            System.out.println();
            System.out.println("      " + "\u0040");                                      //LINHA 1
            System.out.println("  " + "\u22F1" + "\u22F0" + "\u0040" + "\u0040" + "\u22F1" + "\u22F0");     //LINHA 2
            System.out.println("     " + "\u0040" + "\u0040");
            System.out.println("     " + "\u0040" + "\u0040");
            System.out.println();                                                 //se o braço estiver esticado
        }else if(botaoBraco == 2){
            System.out.println("Esticar o braço: ");
            System.out.println();
            System.out.println("     " + "\u0040");                                      //LINHA 1
            System.out.println("   " + "\u22F0"  + "\u0040" + "\u0040" + "\u22F1" );     //LINHA 2
            System.out.println(" " + "\u22F0" + "  "+ "\u0040" + "\u0040"+ "  " + "\u22F1" );                    //linha3
            System.out.println("     " + "\u0040" + "\u0040");
            System.out.println("     " + "\u0040" + "\u0040");
            System.out.println();
        }else{
            System.out.println("Opção Inválida:");
        }
    }

    public void exibeFrases(int Frases){
        this.botaoFrases = Frases;

        if(botaoFrases == 1){
        if(cont == 7){
            cont = 1;
        }


        if(cont == 1){
            System.out.println();
            System.out.println("Buzz Lighter ao seu dispor");
            System.out.println();
        }else if(cont == 2){
            System.out.println();
            System.out.println("Diario da missao: me infiltrei no território inimigo sem ser detectado");
            System.out.println();
        }else if(cont == 3){
            System.out.println();
            System.out.println("Pare!!! Ordeno que pare!");
            System.out.println();
        }else if(cont == 4) {
            System.out.println();
            System.out.println("Nunca duvidei de mim mesmo comandante e nao vou começar agora");
            System.out.println();
        }else if(cont == 5){
            System.out.println();
            System.out.println("Alvo se aproximando");
            System.out.println();
        }else{
            System.out.println();
            System.out.println("Comando estelar estou me aproximando da escotilha de fuga,preparar lançamento!");
            System.out.println();
        }cont++;
      }
    }

}
