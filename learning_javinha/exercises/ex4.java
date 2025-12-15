package learning_javinha.exercises;
import java.util.Scanner;
public class ex4{

    public static void main (String[] args){
        try (Scanner scanner = new Scanner (System.in)){
    System.out.println(">>>>>>>>>CADASTRO PESSOA 1<<<<<<<<<<");
    System.out.println("Digite seu nome:");
    var nome1 = scanner.nextLine();
    System.out.println("Qual sua idade?:");
    var age1 = scanner.nextInt();  
    scanner.nextLine();// para limpar o enter. (estava dando erro)
    System.out.println("-----PESSOA 1 CADASTRADA COM SUCESSO!!!-----");
    
    System.out.println(">>>>>>>>>CADASTRO PESSOA 2<<<<<<<<<<");
    System.out.println("Digite seu nome:");
    var nome2 = scanner.nextLine();
    System.out.println("Qual sua idade?:");
    var age2 = scanner.nextInt();  
    scanner.nextLine();// para limpar o enter. (estava dando erro)
    System.out.println("-----PESSOA 2 CADASTRADA COM SUCESSO!!!-----");
    var difAge = age1 - age2;
    System.out.printf("\nA diferença de idade entre %s e %s é de %s Anos\n"
    , nome1, nome2, difAge);



   

}
    }
}
