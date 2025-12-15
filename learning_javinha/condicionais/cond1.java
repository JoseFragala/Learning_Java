package learning_javinha.condicionais;

import java.util.Scanner;
 

public class cond1 {
    

    public static  void main (String[] args){
        try (var scanner = new Scanner(System.in)){
        System.out.println("Informe seu nome");
        var name = scanner.next();
        System.out.println("Informe seu idade:");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase( "s");

    

    if (age >= 18){
        System.out.printf("%s, você tem %s anos e pode dirigir\n", name, age);
    }else if (age >=16 && isEmancipated) {
        System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir\n",name, age);
    }else {
        System.out.printf ("%s, você não pode dirigir \n", name);
    }
    System.out.println("Fim da execução");


    //outras formas.

    // Com apenas uma linha no if.
    /*
     if (age >= 18) System.out.printf("%s, você tem %s anos e pode dirigir\n", name, age);
    System.out.println("Fim da execução");
    */

    // com if simplificado usando operador lógico OU (||)
    /*
    if ((age >= 18) || (age >=16 && isEmancipated)){
        System.out.printf("%s, você pode dirigir\n", name);

    }else {
        System.out.printf ("%s, você não pode dirigir \n", name);
    }
    System.out.println("Fim da execução");
    */

    // Declarando uma variavel booleana para armazenar o resultado da condição.
    /*
    var canDrive = (age >=18) || (age >=16 && isEmancipated);
    if (candrive){
        System.out.printf("%s, você pode dirigir\n", name);
}else{
    System.out.printf("%s, você não pode dirigir \n", name);
}
    System.out.println("Fim da execução");
    
}   
    */


// resumindo o código:
/*
 var message = "";
 var canDrive = (age >=18) || (age >=16 && isEmancipated);
    if (candrive){
     message = name + "%s, você pode dirigir\n"; 
}else{
   message =  name +"%s, você não pode dirigir \n";
}
   System.out.printf(message);
    System.out.println("Fim da execução");





*/

 //usando Elvis operator (condição ? valorSeVerdadeiro : valorSeFalso) 
 // usado para atribuir valor a uma variável com base em uma condiçõa
 // diferente do if else que permite executar blocos de código diferentes com base na condição.
  /*
  var CanDrive = (age >=18) || age >=16 && isEmancipated );
  var message = canDrive ?
       name + ", você pode dirigir\n":
       name + ", você não pode dirigir \n";

System.out.println(message);
System.out.println("Fim da execução");
  
  */





    }
}


}