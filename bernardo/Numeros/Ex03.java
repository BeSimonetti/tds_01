// Escreva um programa para verificar se os números são pares ou ímpares.

public class Ex03{
    public static void main(String[] args) {
    
        for(int i=0; i<args.length; i++){
            int num = Integer.parseInt(args[i]);
            if(num % 2==0){
                System.out.println("O número é par");
            }else{
                System.out.println("O número é impar");
            }
        }
    }
}