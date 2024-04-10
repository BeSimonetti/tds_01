/*import java.util.Scanner;
public class calcInfinita {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            System.out.println("Digite o primeiro número ou 0 para encerrar: ");
            String input = sc.next();
            // double num1 = Double.parseDouble(input);
            
            if (input.equalsIgnoreCase("0")) {
                System.out.println("Saindo...");
                break;
            }

            double num1 = Double.parseDouble(input);

            System.out.println("Digite a operação (+): ");
            char operacao = sc.next().charAt(0);
            System.out.println("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = somar(num1, num2);
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
    
    
    public static void menu(){
        System.out.println();
        System.out.println("OPERCAO DISPONIVEIS");
        System.out.println("'+' para somar.");
        System.out.println();
    }
}*/
import java.util.Scanner;
public class calcInfinita {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();
            System.out.println("Digite o primeiro número ou 0 para encerrar: ");
            double num1 = sc.nextDouble();
             
            if (num1==0) {
                System.out.println("Saindo...");
                break;
            }

            System.out.println("Digite a operação (+): ");
            char operacao = sc.next().charAt(0);
            while(operacao !='+'){
                System.out.println("Operação inválida. Por favor digite corretamente '+'");
                operacao = sc.next().charAt(0);
            }
            System.out.println("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = somar(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
            }
        }
        sc.close();
    }
    
    
    public static double somar(double a, double b){
        return a+b;
    }
    
    
    public static void menu(){
        System.out.println();
        System.out.println("OPERCAO DISPONIVEIS");
        System.out.println("'+' para somar.");
        System.out.println();
    }
}
