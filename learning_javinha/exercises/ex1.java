package learning_javinha.exercises;
// escreva um código que receba o nome e o ano de nascimento de alguém
// e imprima na tela a seguinte mensagem: Olá 'Fulano' você tem x anos".
import java.util.Scanner;
public class ex1{

    public static void main (String[] args){
        var scanner = new Scanner (System.in);
    System.out.println("What is your name?");
    var name = scanner.nextLine();
    System.out.println ("How old are you?");
    var age  = scanner.nextInt();
    
    System.out.printf("Hello, %s you are %s years old", name, age);
    scanner.close();
    }
    
}

