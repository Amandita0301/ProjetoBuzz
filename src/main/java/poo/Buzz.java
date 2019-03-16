package poo;

public class Buzz {

    //atributos da classe

    private int ligar;
    private int capacete;
    private int botaoFrases;
    private int botaoLaser;
    private int botaoAsas;
    private int botaoBraco;


    //metodos

    public int obterEstadoCapacete() {return capacete; }

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
            System.out.println("\u21A0");            //imprime caracter "laser"
        }
        System.out.println("\u21A0");
    }

    public void botaoAsas(){


    }

}
