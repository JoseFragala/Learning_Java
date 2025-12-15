package learning_javinha.exercises.est_controle;
import java.util.Scanner;
// Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número.
public class estrutex {
    

    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Digite um número:");
    var number = scanner.nextInt();
    
    for (int i = 0; i <= 10 ; i++){
        var tabuada = number * i;
        System.out.printf("%s X %s = %s\n",  number, i, tabuada);
    }
    scanner.close();
}
}