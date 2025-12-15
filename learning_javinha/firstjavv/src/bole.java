package learning_javinha.firstjavv.src;
import java.util.Scanner;

public class bole{
// delcarar comentário
/*declarar 
comentário*/
/**
 * varios 
 * comentários
 */


//println - imprime o valor e logo depois colocar um \n
//print - imprime o valor sem pular linha
//printf - formata a saída




    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        System.out.println ("how much is 2 + 2 ?");
        var answer = scanner.nextInt();
        var isWrong = answer != 4;
        System.out.printf ("the answer is 4, did you get it rigth? (%s)\n", !isWrong);

    System.out.println("How old are you?");
    var age = scanner.nextInt();
    var isAdult = age >=18;
    System.out.printf("You are an adult? (%s)\n", isAdult);     

    System.out.println("Are u emancipated? (true/false)"); 
    var isEmancipated = scanner.nextBoolean();
    System.out.printf("Are u emancipated? (%s)\n", isEmancipated);  


    System.out.println("can you drive?");
    var canDrive = (isEmancipated && age >=16)|| age >=18; //ou lógico
    // var canDrive = carLicense | age >=18; //ou bit a bit "ou burro"
    // os parenteses são importantes para definir a precedência das operações


    
    System.out.printf("Can you drive? (%s)\n", canDrive);    


    //tabela para resumo dos operadores lógicos
/* 
    System.out.printf("true && true = %s\n", true && true);
    System.out.printf("false && false = %s\n", false && false);
    System.out.printf("true && false = %s\n", true && false);
    System.out.printf("false && true = %s\n", false && true);
    System.out.println("--------------");
    System.out.printf("true || true = %s\n", true || true);
    System.out.printf("false || false = %s\n", false || false); 
    System.out.printf("true || false = %s\n", true || false);
    System.out.printf("false || true = %s\n", false || true);
    System.out.println("--------------");
    System.out.printf("!true = %s\n", !true);    
    System.out.printf("!false = %s\n", !false);
    */

    scanner.close();
}
}
