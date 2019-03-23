package poo;

import java.util.Scanner;
import java.lang.String;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao = 0, nome, nom;

        Buzz boneco = new Buzz();
        Buzz boneco2 = new Buzz();
        Buzz boneco3 = new Buzz();


        System.out.println("Olá amiguinho:");
        System.out.println("Quer brincar como o Buzz 1, 2 ou 3?:");
        nome = teclado.nextInt();

        if(nome == 2) {
            boneco = boneco2;
        }
        if(nome == 3){
            boneco = boneco3;
        }

        do{
            System.out.println("Digite:");
            System.out.println("1:Mexer no Laser:");
            System.out.println("2:Mexer as Asas:");
            System.out.println("3:Mexer no capacete:");
            System.out.println("4:Mexer os Braços:");
            System.out.println("5:Ler as Frases:");
            System.out.println("6:Trocar de Buzz:");
            System.out.println("7:Encerrar a Brincadeira:");
            opcao = teclado.nextInt();

            switch (opcao)
            {
                case 1:
                    System.out.println("Digite:");
                    System.out.println("1:Para acender o laser");
                    System.out.println("2:Para apagar o laser");
                    boneco.alteraLaser(teclado.nextInt());
                    break;

                case 2:
                    System.out.println("Digite:");
                    System.out.println("1:Para abrir as asas");
                    System.out.println("2:Para fechar as asas");
                    boneco.alteraAsas(teclado.nextInt());
                    break;

                case 3:
                    System.out.println("Digite:");
                    System.out.println("1:Para fechar o capacete");
                    System.out.println("2:Para abrir o capacete");
                    boneco.alteraCapacete( teclado.nextInt());
                    break;

                case 4:
                    System.out.println("Digite:");
                    System.out.println("1:Para dobrar os braços:");
                    System.out.println("2:Para esticar os braços:");
                    boneco.alteraBraco(teclado.nextInt());
                    break;

                case 5:
                    System.out.println("Digite:");
                    System.out.println("1:Para ler uma frase:");
                    boneco.exibeFrases(teclado.nextInt());
                    break;

                case 6:
                    System.out.println("Olá amiguinho:");
                    System.out.println("Quer brincar com o Buzz 1, 2 ou 3?:");
                    nome = teclado.nextInt();

                    if(nome == 2) {
                        boneco = boneco2;
                    }
                    if(nome == 3){
                        boneco = boneco3;
                    }

                default:
                    break;

            }

        }while(opcao != 7);

        System.out.println("Acabou a brincadeira");


    }
}
