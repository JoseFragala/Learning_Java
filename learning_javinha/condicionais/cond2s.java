package learning_javinha.condicionais;
import java.util.Scanner;
public class cond2s {


    public static void main (String[] args){
        try (var scanner = new Scanner (System.in)){
        System.out.println("Informe um número de 1 até 7");
        var option = scanner.nextInt();
        switch (option){
            case 1:
            case 7:
                System.out.println("Final de semana!!!");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

        // outra forma de trabalhar  com switch case

        /*
        // simbolo de arrow.
        case 1 -> System.out.println("Dommingo");
        case 2 -> System.out.println("segunda");
        case 3 -> System.out.println("terça");
        case 4 -> System.out.println("quarta");
        case 5 -> System.out.println("quinta");
        case 6 -> System.out.println("sexta");
        case 7 -> System.out.println("sábado");
        default -> System.out.println("opção inválida");


    .....dessa forma não precisa do break, pois o java entende que é para parar apos a execução da linha.........

    para agrupar também fica mais simples dessa forma:

    case 1, 7 -> System.out.println("Final de semana");

        
    */

// outra forma é usando a atribuição de uma variavel. switch case trabalahr com retorno de valor.
/*


var message = switch (option){
 case 1,7 -> {
    var day = option == 1 ? "domingo" : "sábado";
    String.format("Hoje é %s, final de semana").formatted(day);
    }
    case 1 -> System.out.println("Dommingo");
        case 2 -> System.out.println("segunda");
        case 3 -> System.out.println("terça");
        case 4 -> System.out.println("quarta");
        case 5 -> System.out.println("quinta");
        case 6 -> System.out.println("sexta");
        case 7 -> System.out.println("sábado");
        default -> System.out.println("opção inválida");



*/

   }

}
