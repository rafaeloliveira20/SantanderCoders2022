import java.util.Scanner;
public class ListaDeFrutas {
    public static void main(String[] Args){
        /*Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final
           da entrada dos 5 itens, exiba a lista completa*/
        Scanner teclado = new Scanner(System.in);

        for (int i = 0;i <= 5; i++){
            System.out.println("Digite a "+i+" frutas da Lista");
            String fruta = teclado.next();
            System.out.println(fruta);
        }
    }
}
