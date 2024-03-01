// Escreva um programa para inverter um número dado.

public class Ex09{
    public static void main (String[] args){        
        String num = "";
        for(int i = args[0].length() - 1; i>=0; i--){
            num += args[0].charAt(i);
        }
        System.out.println(num);
    }
}