import java.util.Scanner;

public class Exercico3 {

    // Crie um algoritmo que leia o valor do salário de um usuário, calcule a quantidade de salários mínimos que esse usuário ganha e imprima o resultado.

    public static void main(String[] args){

        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println( " Digite o valor do seu salário: ");
        double salario = entradaDoUsuario.nextDouble();

        double salarioMinimo = salario / 1212.00;
        System.out.printf( " Você ganha: %.2f salarios mínimos " , salarioMinimo );

    }
}
