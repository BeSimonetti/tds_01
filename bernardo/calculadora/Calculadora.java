import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            System.out.println("Digite o primeiro número ou SAIR para encerrar: ");
            String input = sc.next();
            // double num1 = Double.parseDouble(input);
            
            if (input.equalsIgnoreCase("SAIR")) {
                System.out.println("Saindo...");
                break;
            }

            double num1 = Double.parseDouble(input);

            System.out.println("Digite a operação (+, -, *, /): ");
            char operacao = sc.next().charAt(0);
            System.out.println("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = somar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case '-':
                    resultado = subtrair(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case '*':
                    resultado = multiplicar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case '/':
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    return; 
            }
        }
        sc.close();
    }
    
    
    public static double somar(double a, double b){
        return a+b;
    }
    public static double subtrair(double a, double b){
        return a-b;
    }
    public static double multiplicar(double a, double b){
        return a*b;
    }
    public static double dividir(double a, double b){
        if (b != 0) {
            return a/b;
        } else {
            System.out.println("Não existe divisão por 0");
            return 0; 
        }
    }
    public static void menu(){
        System.out.println();
        System.out.println("OPERCAO DISPONIVEIS");
        System.out.println("'+' para somar.");
        System.out.println("'-' para subtrair");
        System.out.println("'*' para multiplicar");
        System.out.println("'/' para dividir");
        System.out.println();
    }
}
