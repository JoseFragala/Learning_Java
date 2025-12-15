public class bitwise {
    
    public static void main(String[] args) {
    var value1 = 6;
    var binary1 = Integer.toBinaryString(value1);
    System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
    var value2 = 5;
    var binary2 = Integer.toBinaryString(value2);
    System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
    var result = value1 | value2;
    var binaryResult = Integer.toBinaryString(result);
    System.out.printf("%s | %S = %s (representação binária %s)\n", value1, value2, result, binaryResult);

    /*
    0 = false
    1 = true
operador ou |  :
    1 1 0 (6)
    1 0 1 (5)
    1 1 1 (7)  resultado
    */    

// operador e &
/*
    1 1 0
    1 0 1
    1 0 0 resultado

*/

// operador char ^
/*
    1 1 0
    1 0 1
    0 1 1 resultado

*/

// operador complement ~
/*
    00000000000000000000000000000110
    11111111111111111111111111111001

    igual negação

*/

//shift operator left << (deslocamento de bits)
/* 

     1 0 0 1
 1 0 1  0  0

*/

//shift operator rigth >> (deslocamento de bits)
/* 
        1101
      000110 (1)  ficou de fora

      se o numeo é negativo completa com 1
      

*/
      


// usigned rigth shift operator igual ao left shift operator >>>


    }
}
