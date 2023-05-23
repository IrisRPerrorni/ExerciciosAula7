import java.util.Scanner;

public class Exercicio2 {
    //Crie um algoritmo que receba a altura e peso do usuário, calcule seu IMC e exiba seu valor.
    //OBS:  Fórmula: IMC = peso/ (altura x altura).

    public static void main (String [] args){
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println( " Digite a sua altura (m): ");  // Imprimir a frase
        double altura = entradaDoUsuario.nextDouble();      // Inserir o valor da altura

        System.out.println( " Digite o seu peso (kg): ");   // Imprimir a frase
        double peso = entradaDoUsuario.nextDouble();        // Inserir o valor do peso

        double imc = peso/ (altura* altura);               // Calculo do imc
        System.out.println(" O cálculo final do IMC é: " + imc); //imprimir o valor do imc
    }
}
