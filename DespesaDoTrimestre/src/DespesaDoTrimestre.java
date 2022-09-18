public class DespesaDoTrimestre {
    public static void main(String[] args){
        /*	 Na	empresa	em que trabalhamos,há tabelas com o	gasto de cada mês.Para fechar o	balanço do primeiro	trimestre,
        	 precisamos	somar o	gasto total.Sabendo	que, em janeiro,foram gastos 15mil reais,em fevereiro,
        	 23mil reais e,em março,17mil reais,faça um programa que calcule e imprima a despesa total no
        	 trimestre e a média mensal	de gastos.*/

        int jan = 15000;
        int fev = 23000;
        int mar =17000;
        int GastoTotal = jan + fev + mar;
        int media = GastoTotal/3;
        System.out.println("O gasto total do trimestre foi " +GastoTotal + " reais");
        System.out.println("A média de gastos no trimestre foi de "+media +" reais");

    }
}
