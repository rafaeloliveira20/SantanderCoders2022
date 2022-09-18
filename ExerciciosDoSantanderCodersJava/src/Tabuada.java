import java.util.Scanner;

public class Tabuada {
    /*Escreva um programa que informa a tabuada de multiplicação de um
número informado pelo usuário (entre 1-10)*/
    public static void main(String[] Args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro entre 1-10 ");
        int num = teclado.nextInt();
        System.out.println("Você vera a tabuda de "+num);

        for (int i = 1; i <= 10; i++){
            int result = num*i;
            System.out.println(num+"X"+i+"= "+result);
        }
    }

}
