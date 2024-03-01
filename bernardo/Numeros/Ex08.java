// Crie um programa para gerar a série de Fibonacci até um número dado.

public class Ex08{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        
        int a = 0, b = 1, c = 0;
        for(int i = 0; i<num; i++){
            if(i == 0){
                System.out.println(a);
            }else if(i == 1){
                System.out.println(b);
            }else{
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}