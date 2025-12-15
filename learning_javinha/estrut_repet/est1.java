package learning_javinha.estrut_repet;
import java.util.Scanner;

public class est1 {
    
    public static void main  (String[] args){
        try (var scanner = new Scanner (System.in)){
        for (;;){
            System.out.println("Digite um nome:");
            var name = scanner.next();

            //string a gente não pode usar operador == então precisa usar o método equals.
            if (name.equalsIgnoreCase("exit")) break;

            System.out.println(name);
        }
        }
    }
}
// oder way to do it

/*
var ii = 2;
for (; ii <= 10; ii++){
    System.out.println(ii);
}

or 

for (var ii = 2; ii <= 10; ii++){
    System.out.println(ii);
}

or

for (var ii = 2; ii <= 10;){
    System.out.println(ii);
    if (ii == 10) break;
    ii++;}




just print even numbers

for (var ii = 2; ii <= 10; ii += 2){
    System.out.println(ii);
}




or


for (var i = 0; i <= 100; i++){
    if (i % 2 != 0) continue;
    System.out.println(i);
}




using args

for (var i = 0; i < args.length; i++){
    System.out.println(args[i]);
}



for (var arg : args){
    System.out.println(arg);
}


to numeric values

for (var i = 0; i< args.length; i++){
    system.out.println((i+1) + " - " + args[i]);
}
*/
