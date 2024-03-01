// escreva um programa para calcular a raiz quadrada dos números dados.
import java.lang.Math;

public class Ex07{
    public static void main(String[] args){
        int num;
        for(int i=0; i<args.length; i++){
            num = Integer.parseInt(args[i]);
            double raizQuad = Math.sqrt(num);
            System.out.println(raizQuad);
        }
    }
}