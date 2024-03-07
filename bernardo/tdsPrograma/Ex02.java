/*Desenvolva um programa que solicite ao usuário que insira um número e, em seguida,
exiba todos os divisores desse número. Utilize um loop `for` ou `while` para
encontrar os divisores. */


public class Ex02 {
    public static void main(String[] args) {
        int num;
        for(int i=0; i<args.length; i++){
            num = Integer.parseInt(args[i]);
            for(int j=num; j>1; j--){
                if(num % j == 0){
                    System.out.println(j);
                }
            }
        }
    }
}
