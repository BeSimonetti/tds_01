// Escreva um programa pra verificar se o número é palindromo ou não.

public class Ex10{
    public static void main(String[] args){
        for(int j=0; j<args.length; j++){
            String plvr = "";
            for(int i = args[j].length() - 1; i >= 0; i--){
                plvr += args[j].charAt(i);
            }
            if( args[j].equals(plvr)){
                System.out.println("Este número é palíndromo");
            } else{
                System.out.println("Este número não é palíndromo");
            }
        }    
    }
}