// Escreva um programa para calcular o fatorial dos números digitados.
public class Ex05{
    public static void main(String[] args){
        int num;
        for(int i=0; i<args.length; i++){
            num = Integer.parseInt(args[i]);
            long fatorial = 1l;
            for(int j=num; j>1; j--){
                fatorial *= j;
            }
            System.out.println(fatorial);
        }
    }
}