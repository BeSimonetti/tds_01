/* Escreva um programa que calcule a média de uma lista de números fornecidos pelo 
usuário. O programa deve continuar solicitando números até que o usuário insira um
valor negativo, e então deve exibir a média dos números inseridos. Você pode utilizar
uma estrutura de while, utilizar uma variável para somar os valores lidos e uma
variável para somar a quantidade de vezes que foi executado. */
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        double soma = 0;
        System.out.print("Digite os números ");
        while(true){
            double numero = scanner.nextDouble();
            if(numero<0){
                break;
            }
            soma += numero;
            i++;
        }
        if(i>0){
            double media= soma/i;
            System.out.println("A média é: "+ media);
        }else{
            System.out.println("Nenhum número foi inserido, não foi possível calcular.");
        }
        scanner.close();
    }
}


