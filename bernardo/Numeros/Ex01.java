// Escreva um programa para calcular a soma dos números informados.

public class Ex01{
    public static void main(String[] args){
        float num = 0;
        for(int i=0; i<args.length; i++){
            num += Float.parseFloat(args[i]);
        }
        System.out.println(num);
    }
}