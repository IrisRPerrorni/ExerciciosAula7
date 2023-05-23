import java.util.Scanner;

public class Exercicio1 {

    //faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.
    // Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
    // Imprima os dados do programa com as mensagens adequadas.

    public static void main(String[] args){

        double pesoPeixe = 60.5; // ler o peso
        double excesso = pesoPeixe - 50; // Calcular o excesso
        double multa = excesso * 4; // Gerar o valor da multa

        System.out.println(" O peso do peixe é (kg): " + pesoPeixe); // Imprimir o peso do peixe
        System.out.println(" Peso em excesso (kg): " + excesso);  // IMprimir o kg em excesso
        System.out.println(" Valor da multa por excesso de peso R$ " + multa); // Imprimir o Valor da multa




    }
}
