package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Buzz boneco = new Buzz();
        int opcao = 0;

        System.out.println("Vamos brincar?:");

        do{
            System.out.println("Digite:");
            System.out.println("1:Mexer no Laser:");
            System.out.println("2:Mexer as Asas:");
            System.out.println("3:Mexer no capacete:");
            System.out.println("4:Mexer os Braços:");
            System.out.println("5:Ler as Frases:");
            System.out.println("6:Encerrar a Brincadeira:");
            opcao = teclado.nextInt();

            switch (opcao)
            {
                case 1:
                    System.out.println("Digite:");
                    System.out.println("1:Para acender o laser");
                    System.out.println("2:Para apagar o laser");
                    boneco.setBotaoLaser(teclado.nextInt());
                    boneco.alteraLaser();
                    break;

                case 2:
                    System.out.println("Digite:");
                    System.out.println("1:Para abrir as asas");
                    System.out.println("2:Para fechar as asas");
                    boneco.setBotaoAsas(teclado.nextInt());
                    boneco.alteraAsas();
                    break;

                case 3:
                    System.out.println("Digite:");
                    System.out.println("1:Para fechar o capacete");
                    System.out.println("2:Para abrir o capacete");
                    boneco.setCapacete(teclado.nextInt());
                    boneco.alteraCapacete();
                    break;

                case 4:
                    System.out.println("Digite:");
                    System.out.println("1:Para dobrar os braços:");
                    System.out.println("2:Para esticar os braços:");
                    boneco.setBotaoBraco(teclado.nextInt());
                    boneco.alteraBraco();
                    break;

                case 5:
                    System.out.println("Digite:");
                    System.out.println("1:Para ouvir uma frase:");
                    boneco.setbotaoFrases(teclado.nextInt());
                    boneco.exibeFrases();
                    break;

                default:
                    System.out.println("Opção não encontrada, digite uma das opções listadas: ");
                    break;
            }

        }while(opcao != 6);

        System.out.println("Acabou a brincadeira");


    }
}
