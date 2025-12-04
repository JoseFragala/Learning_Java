//Escreva um código que recebe a base e a altura de um retângulo, calcule sua área e exbiba na tela.
import java.util.Scanner;
public class ex3{

    public static void main (String[] args){
        var scanner = new Scanner (System.in);
    System.out.println("Digite a base do retângulo:");
    var base = scanner.nextInt();
    System.out.println("Digite a altura do retângulo:");
    var altura = scanner.nextInt();  
    var area = base*altura;
    System.out.printf("Base(%s) X Altura(%s), então, área = %sm²\n", base, altura, area);

}
}