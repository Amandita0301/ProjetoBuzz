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
            System.out.println("1:Acender o Laser:");
            System.out.println("2:Mexer as Asas:");
            System.out.println("3:Falar Frases:");
            System.out.println("4:Mexer os Braços:");
            System.out.println("5:Mexer no Capacete:");
            System.out.println("6:Encerrar a Brincadeira:");
            opcao = teclado.nextInt();

//            switch (1){
//
//
//
//            }
//







        }while(opcao != 6);




    }
}
