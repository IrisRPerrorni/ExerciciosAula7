import java.util.Scanner;

public class Exercicio4 {
    //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dia.

    public static void main(String [] args){
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = entradaDoUsuario.nextInt();

        System.out.println( " Meses: ");
        int mes = entradaDoUsuario.nextInt();

        System.out.println(" dias: ");
        int dia = entradaDoUsuario.nextInt();

        int totalDiasAno = idade * 365;
        int totalDiasmeses = mes * 30 ;

        int totaldias = totalDiasAno + totalDiasmeses + dia;

        System.out.println( " Você tem: " + totaldias + " dias de idade " );



    }
}
