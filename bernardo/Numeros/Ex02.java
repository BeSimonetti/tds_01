// Crie um programa para encontrar a média dos números informados.

public class Ex02{
    public static void main(String[] args){
        double result = 0;
        double num = 0;
        for(int i=0; i<args.length; i++){
            num += Double.parseDouble(args[i]);
        }
        result = num/args.length;
        System.out.println(result);
    }
}