import java.util.Scanner;

public class ConverterTemperaturas {
    /*Questão 2.
Escreva um programa que converte temperaturas de Celsius para Fahrenheit. Fórmula (0 °C ×
9/5) + 32 = 32 °F.*/
    public static void main(String[] Args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius:");
        double C = teclado.nextDouble();

        double F = C*9/5 + 32;
        System.out.println(C+" Celsius em Fahrenheit é: "+F+"F");
    }
}
