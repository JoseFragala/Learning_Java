package Learning_Java.estrut_repet;

public class est2 {

    public static void main (String[] args){

    var name = "";
    while (!name.equals("exit")){
        System.out.println("Informe um nome:");
        name = scanner.next();
        System.out.println(name);
    }

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