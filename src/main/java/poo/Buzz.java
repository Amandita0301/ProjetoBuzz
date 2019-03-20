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



    public int getBotaoAsas() { return botaoAsas; }
    public void setBotaoAsas(int botaoAsas) { this.botaoAsas = botaoAsas; }

    public int getBotaoBraco() { return botaoBraco; }
    public void setBotaoBraco(int botaoBraco) { this.botaoBraco = botaoBraco; }

    public int getCapacete() { return capacete; }
    public void setCapacete(int capacete) { this.capacete = capacete; }

    public int getbotaoFrases() { return botaoFrases; }
    public void setbotaoFrases(int botaoFrases) { this.botaoFrases = botaoFrases; }

    public int getBotaoLaser() { return botaoLaser; }
    public void setBotaoLaser(int botaoLaser) { this.botaoLaser = botaoLaser; }


    //metodos

    public void alteraCapacete() {

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

    public void alteraLaser(){

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

    public void alteraAsas() {

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


    public void alteraBraco(){
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

    public void exibeFrases(){

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
