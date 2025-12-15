package learning_javinha.exercises;
// escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela.

import java.util.Scanner;
public class ex2{

    public static void main (String[] args){
        var scanner = new Scanner (System.in);
    System.out.println("Digite o lado 1 do quadrado:");
    var lado1 = scanner.nextInt();
    System.out.println("Digite o lado 2 do quadrado:");
    var lado2 = scanner.nextInt();  
    var area = lado1*lado2;
    System.out.printf("Lado 1(%s) X lado 2(%s), então, área = %sm²\n", lado1, lado2, area);
    

    scanner.close();
}
}