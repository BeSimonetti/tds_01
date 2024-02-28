// Crie um programa para encontrar o maior número entre os números dados.
public class Ex04{
    public static void main(String[] args){
        double num;
        double maior = Double.parseDouble(args[0]);
        for(int i=0; i<args.length; i++){
            num = Double.parseDouble(args[i]);
            if(num>maior){
                maior = num;
            }
        }
        System.out.println(maior);
    }
} 
