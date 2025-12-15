package learning_javinha.estrut_repet;
import java.util.Scanner;
public class est2 {

    public static void main (String[] args){

    Scanner scanner = new Scanner (System.in);

        
    var name = "";
    while (!name.equals("exit")){
        System.out.println("Informe um nome:");
        name = scanner.next();
        System.out.println(name);
    }
    scanner.close();

    }
    
}
/*
oders ways to do it

while (true){
    System.out.println("Informe um nome:");
    name = scanner.next();
    System.out.println(name);


    if (name.equalsIgnoreCase("exit")) break;

    }
*/

// using do while

/*
do{
    System.out.println("Informe um nome:");
    name = scanner.next();
    System.out.println(name);

    if (name.equalsIgnoreCase("exit")) break;
}while (true);
*/

/*
do{
    System.out.println("Informe um nome:");
    name = scanner.next();
    System.out.println(name);

    
}while (!name.equalsIgnoreCase("exit"));

*/


/*
var name = "exit";
do{
    System.out.println("Informe um nome:");
    name = scanner.next();
    System.out.println(name);

    
}while (!name.equalsIgnoreCase("exit"));

*/