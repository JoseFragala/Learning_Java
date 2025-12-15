import java.util.Scanner;

public class calc {
    

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("informe o primeiro número:");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        var value2 = scanner.nextInt(); 
        System.out.printf("%s+ %s = %s\n", value1, value2, value1 + value2);

         
        System.out.println("informe o primeiro número:");
        var value3 = scanner.nextFloat();
        System.out.println("Informe o segundo número:");
        var value4 = scanner.nextFloat(); 
        System.out.printf("%s / %s = %s\n", value3, value4, value3 / value4); // divisão

        System.out.println("informe o primeiro número:");
        var value5 = scanner.nextFloat();
        System.out.println("Informe o segundo número:");
        var value6 = scanner.nextFloat(); 
        System.out.printf("%s %% %s = %s\n", value5, value6, value5 % value6); // resto da divisão


        // precedewncia dos operadores
        System.out.println(3 + 4 * 5); // 23
        System.out.println((3 + 4) * 5); // 35

        //operadores matematicos nas variaveis
        var value = 5;
       // value = value + 3; //8
       // FORMA RESUMIDA:
       value += 3;
         System.out.println(value);

        // para fazer raiz quadrada.

        System.out.println("Informe um número para calcular a raiz quadrada:");
        var number = scanner.nextDouble();
        var squareRoot = Math.sqrt(number);
        System.out.printf("A raiz quadrada de %s é %s\n", number, squareRoot);

        //ou
       // System.out.printf("A raiz quadrada de %s é %s\n", number, Math.sqrt(number));

       // para calcular potência
         System.out.println("Informe a base:");
            var base = scanner.nextDouble();
            System.out.println("Informe o expoente:");
            var exponent = scanner.nextDouble();
            var power = Math.pow(base, exponent);
            System.out.printf("%s elevado a %s é %s\n", base, exponent, power);

            //ou
            //System.out.printf("%s elevado a %s é %s\n", base, exponent, Math.pow(base, exponent));

            //operadores de incremento 
            System.out.println("Incremento:");
            var numeroA = 50;
            System.out.println(++numeroA);
            System.out.println(numeroA);

// decremento
            System.out.println("Decremento:");  
            var numeroB = 50;
            System.out.println(--numeroB);
            System.out.println(numeroB);    


// incremento pós a variável
            System.out.println("Incremento pós a variável:");
            var numeroC = 50;
            System.out.println(numeroC++);
            System.out.println(numeroC); // usa o valor e depois incrementa
        
}
}