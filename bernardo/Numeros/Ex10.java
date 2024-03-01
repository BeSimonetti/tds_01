// Escreva um programa pra verificar se o número é palindromo ou não.

public class Ex10{
    public static void main(String[] args){
        String plvr = "";
        for(int i = args[i].length() - 1; i >= 0; i--){
            plvr += args[i].charAt(i);
        }if(args[i] == plvr){
            System.out.println("Este número é palíndromo");
        } else{
            System.out.println("Este número não é palíndromo");
        }
    }
}