import java.util.Scanner;
public class listaDeFruta {
 /*QUESTÃO 3
 * Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final
da entrada dos 5 itens, exiba a lista completa*/

    public static void main(String[] Args) {
        Scanner ler = new Scanner(System.in);
        String[] cesta = new String[5];
        System.out.println("digite as cino frutas:");
        for (int i = 0; i < cesta.length; i++) {
            cesta[i] = ler.next();
        }
        System.out.println("Na sua cesta tem:");
        for (int j = 0; j < cesta.length;j++){
            System.out.println(cesta[j]);
        }
        //System.out.println(Arrays.toString(cesta));
    }
}