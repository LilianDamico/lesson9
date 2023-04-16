package curso_java;

import java.util.Scanner;

public class lesson9 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = teclado.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("O número digitado é par");
        }
        else {
            System.out.println("O número digitado é impar");
        }

    }
}
